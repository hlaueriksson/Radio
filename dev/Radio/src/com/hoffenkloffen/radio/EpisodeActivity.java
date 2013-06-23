package com.hoffenkloffen.radio;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import io.vov.vitamio.MediaPlayer;

public class EpisodeActivity extends Activity {

    private static final String TAG = "EpisodeActivity";

    private MediaPlayerManager manager;

    private TextView text;

    private Episode episode;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episode);

        episode = getEpisode();

        text = (TextView) findViewById(R.id.text);
        text.setText(episode.getUrl());

        MediaPlayer player = new MediaPlayer(this);

        manager = new MediaPlayerManager(player, episode.getUrl());
        manager.prepare();
    }

    public void play(View view) {
        Log.d(TAG, "play");
        manager.start();
    }

    public void pause(View view) {
        Log.d(TAG, "pause");
        manager.pause();
    }

    public void stop(View view) {
        Log.d(TAG, "stop");
        manager.stop();
    }

    private Episode getEpisode() {
        Bundle extras = getIntent().getExtras();
        String value = extras.getString(Constants.Episode);

        return Episode.deserialize(value);
    }
}
