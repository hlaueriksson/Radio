package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.utils.IDownloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MmsStreamStrategy implements IStreamStrategy {

    private IDownloader downloader;

    public MmsStreamStrategy(IDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public Stream getStream(String content) {
        String fileUrl = getFileUrl(content);

        if (fileUrl == null) return null;

        String response = downloader.getResponse(fileUrl);

        if (response == null) return null;

        String url = getStreamUrl(response);

        if (url == null) return null;

        return new Stream(url);
    }

    private String getFileUrl(String content) {
        String pattern = "href=\"(http://www.rthk.org.hk/asx/rthk/.*?asx)\"";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);

        if (m.find()) return m.group(1);

        return null;
    }

    private String getStreamUrl(String content) {
        String pattern = "<ref href.=.\"(.*)\"/>";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);

        if (m.find()) return m.group(1);

        return null;
    }
}
