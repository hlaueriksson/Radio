package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RtmpStreamStrategy implements IStreamStrategy { // TODO: test error handling

    @Override
    public Stream getStream(String content) {
        String openGraphUrl = getOpenGraphUrl(content);

        if (openGraphUrl == null) return null;

        String url = convertOpenGraphUrl(openGraphUrl);

        return new Stream(url);
    }

    private String getOpenGraphUrl(String page) {
        String pattern = "<meta property=\"og:video\" content=\"(.*)\" />";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(page);

        if (m.find()) return m.group(1);

        return null;
    }

    private String convertOpenGraphUrl(String url) {
        try {
            String decoded = URLDecoder.decode(url, "UTF-8");

            // https://rthkcms3.rthk.hk/jwplayer/player.swf?streamer=rtmp://stmw.rthk.hk/aod/_definst_&file=radio/archive/radio2/siksifung/mp3/20140105.mp3&autostart=true
            String pattern = "streamer=(.*)&autostart=true";

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(decoded);

            if (m.find()) return m.group(1);
        } catch (UnsupportedEncodingException e) {
            // TODO: Log
        }

        return null;
    }
}