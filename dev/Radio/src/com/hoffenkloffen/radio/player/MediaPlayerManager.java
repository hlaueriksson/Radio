package com.hoffenkloffen.radio.player;

import android.util.Log;
import io.vov.vitamio.MediaPlayer;

public class MediaPlayerManager {

    private static final String TAG = "MediaPlayerManager";

    private MediaPlayer player;

    private String path;

    public MediaPlayerManager(MediaPlayer player, String path) {
        this.player = player;
        this.path = path;
    }

    public void prepare() {
        try {
            player.setDataSource(path);
            player.prepare();
        } catch (Exception e) {
            Log.e(TAG, "Prepare failed.", e);
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
