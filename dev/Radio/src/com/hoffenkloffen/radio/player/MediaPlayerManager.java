package com.hoffenkloffen.radio.player;

import com.google.inject.Inject;
import com.hoffenkloffen.radio.utils.ISimpleLogFacade;

public class MediaPlayerManager {

    private final ISimpleLogFacade log;
    private final IMediaPlayerFacade player;

    @Inject
    public MediaPlayerManager(ISimpleLogFacade log, IMediaPlayerFacade player) {
        this.log = log;
        this.player = player;
    }

    public void prepare(String path) {
        try {
            player.setDataSource(path);
            player.prepare();
        } catch (Exception e) {
            log.e("Prepare failed.", e);
        }
    }

    public void start() {
        player.start();
    }

    public void pause() {
        if (!player.isPlaying()) return;

        player.pause();
    }

    public void stop() {
        if (!player.isPlaying()) return;

        player.stop();
    }
}
