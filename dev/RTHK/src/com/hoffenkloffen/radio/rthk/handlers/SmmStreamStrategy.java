package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.utils.IDownloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmmStreamStrategy implements IStreamStrategy { // TODO: test error handling

    private IDownloader downloader;

    public SmmStreamStrategy(IDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public Stream getStream(String content) {
        String fileUrl = getFileUrl(content);
        String response = downloader.getResponse(fileUrl);
        String url = getStreamUrl(response);

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
