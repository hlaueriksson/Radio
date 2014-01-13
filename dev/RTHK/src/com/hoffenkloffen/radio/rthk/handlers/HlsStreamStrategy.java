package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HlsStreamStrategy implements IStreamStrategy {

    @Override
    public Stream getStream(String content) {
        String url = getStreamUrl(content);

        if (url == null) return null;

        return new Stream(url);
    }

    private String getStreamUrl(String content) {
        String pattern = "<a href=\"(.*?)\" class=\"mp3\">MP3</a>";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);

        if (m.find()) return m.group(1);

        return null;
    }
}