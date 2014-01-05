package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.IStreamHandler;
import com.hoffenkloffen.radio.utils.IDownloader;
import com.hoffenkloffen.radio.utils.ILogFacade;
import com.hoffenkloffen.radio.utils.StreamParser;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamHandler implements IStreamHandler {

    private final IDownloader downloader;
    private final StreamParser parser;

    public StreamHandler(ILogFacade log, IDownloader downloader) {
        this.downloader = downloader;
        parser = new StreamParser(log);
    }

    @Override
    public Stream getStream(Episode episode) {
        String response = downloader.getResponse(episode.getUrl());
        String url = getStreamUrl(response);
        InputStream stream = downloader.getInputStream(url);

        return parser.parse(stream);
    }

    private String getStreamUrl(String page) {
        String pattern = "href=\"(http://www.rthk.org.hk/asx/rthk/.*?asx)\"";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(page);

        while (m.find()) {
            return m.group(1);
        }

        return null;
    }
}
