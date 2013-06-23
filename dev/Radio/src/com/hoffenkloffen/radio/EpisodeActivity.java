package com.hoffenkloffen.radio;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import io.vov.vitamio.MediaPlayer;

public class EpisodeActivity extends Activity {

    private static final String TAG = "EpisodeActivity";

    private MediaPlayerManager manager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode);

        MediaPlayer player = new MediaPlayer(this);

        manager = new MediaPlayerManager(player, getEpisode().getUrl());
        manager.start();

        Log.d(TAG, "start");
    }

    private Episode getEpisode() {
        Bundle extras = getIntent().getExtras();
        String value = extras.getString(Constants.Episode);

        return Episode.deserialize(value);
    }
}
