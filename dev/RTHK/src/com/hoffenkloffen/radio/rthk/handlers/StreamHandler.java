package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.IStreamHandler;
import com.hoffenkloffen.radio.utils.IDownloader;

public class StreamHandler implements IStreamHandler {

    private final IDownloader downloader;

    public StreamHandler(IDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public Stream getStream(Episode episode) {
        String response = downloader.getResponse(episode.getUrl());

        IStreamStrategy parser = new RtmpStreamStrategy();
        Stream result = parser.getStream(response);

        if (result != null) return result;

        parser = new SmmStreamStrategy(downloader);
        result = parser.getStream(response);

        return result;
    }
}
