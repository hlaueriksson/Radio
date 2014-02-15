package com.hoffenkloffen.radio.player;

import android.content.Context;
import com.google.inject.Inject;
import io.vov.vitamio.MediaPlayer;

import java.io.IOException;

public class MediaPlayerFacade implements IMediaPlayerFacade {
    private final MediaPlayer player;

    @Inject
    public MediaPlayerFacade(Context context) {
        this.player = new MediaPlayer(context);
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

    @Override
    public void release() {
        player.release();
    }
}
