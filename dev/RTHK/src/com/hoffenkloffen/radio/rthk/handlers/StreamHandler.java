package com.hoffenkloffen.radio.rthk.handlers;

import com.google.inject.Inject;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.IStreamHandler;
import com.hoffenkloffen.radio.utils.IDownloader;

public class StreamHandler implements IStreamHandler {

    private final IDownloader downloader;

    @Inject
    public StreamHandler(IDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public Stream getStream(Episode episode) {
        String response = downloader.getResponse(episode.getUrl());

        IStreamStrategy strategy = new HlsStreamStrategy(downloader);
        Stream result = strategy.getStream(response);

        if (result != null) return result;

        strategy = new MmsStreamStrategy(downloader);
        result = strategy.getStream(response);

        return result;
    }
}
