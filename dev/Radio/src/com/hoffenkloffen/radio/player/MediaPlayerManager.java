package com.hoffenkloffen.radio.player;

import com.hoffenkloffen.radio.utils.ILogFacade;

public class MediaPlayerManager { // TODO do we need this?

    private static final String TAG = MediaPlayerManager.class.getSimpleName();

    private final ILogFacade log;
    private final IMediaPlayerFacade player;
    private final String path;

    public MediaPlayerManager(ILogFacade log, IMediaPlayerFacade player, String path) {
        this.log = log;
        this.player = player;
        this.path = path;
    }

    public void prepare() {
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
