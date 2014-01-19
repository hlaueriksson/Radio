package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.utils.IDownloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HlsStreamStrategy implements IStreamStrategy {

    private IDownloader downloader;

    public HlsStreamStrategy(IDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public Stream getStream(String content) {
        String popupUrl = getPopupUrl(content);

        if (popupUrl == null) return null;

        String response = downloader.getResponse(popupUrl);

        if (response == null) return null;

        String url = getStreamUrl(response);

        if (url == null) return null;

        return new Stream(url);
    }

    private String getPopupUrl(String content) {
        String pattern = "<a href=\"javascript:MM_openPalyerWindow\\('(.*?)','rthk_pop_player','scrollbars=no,resizable=no,width=660,height=400'\\);\" class=\"mp3\">MP3</a>";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);

        if (m.find()) return "http://programme.rthk.hk/channel/radio/" + m.group(1);

        return null;
    }

    private String getStreamUrl(String content) {
        String pattern = "hlsStreamUrl\\[0\\] = '(.*?)';";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);

        if (m.find()) return m.group(1);

        return null;
    }
}