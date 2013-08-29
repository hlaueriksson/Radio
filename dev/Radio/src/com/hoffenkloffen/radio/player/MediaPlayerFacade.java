package com.hoffenkloffen.radio.player;

import io.vov.vitamio.MediaPlayer;

import java.io.IOException;

public class MediaPlayerFacade implements IMediaPlayerFacade {
    private MediaPlayer player;

    public MediaPlayerFacade(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public void setDataSource(String path) throws IOException {
        player.setDataSource(path);
    }

    @Override
    public void prepare() throws IOException {
        player.prepare();
    }

    @Override
    public void start() {
        player.start();
    }

    @Override
    public void pause() {
        player.pause();
    }

    @Override
    public void stop() {
        player.stop();
    }

    @Override
    public boolean isPlaying() {
        return player.isPlaying();
    }
}
