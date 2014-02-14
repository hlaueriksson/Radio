package com.hoffenkloffen.radio.player;

import com.google.inject.Inject;
import com.hoffenkloffen.radio.utils.ILogFacade;

public class MediaPlayerManager {

    private static final String TAG = MediaPlayerManager.class.getSimpleName();

    private final ILogFacade log;
    private final IMediaPlayerFacade player;

    @Inject
    public MediaPlayerManager(ILogFacade log, IMediaPlayerFacade player) {
        this.log = log;
        this.player = player;
    }

    public void prepare(String path) {
        try {
            player.setDataSource(path);
            player.prepare();
        } catch (Exception e) {
            log.e(TAG, "Prepare failed.", e);
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
