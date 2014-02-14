package com.hoffenkloffen.radio;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import org.androidannotations.annotations.*;

@EActivity
public abstract class BaseEpisodeActivity extends Activity {

    private static final String TAG = BaseEpisodeActivity.class.getSimpleName(); // TODO: hide in log facade

    @Inject
    private RadioHandler radioHandler;

    @Inject
    private MediaPlayerManager manager; // TODO: put in service

    @ViewById
    protected TextView text;

    @Extra(Constants.Episode)
    public String json;

    @AfterInject
    public void init() {
        load();
    }

    @Click
    public void play() {
        Log.d(TAG, "play");
        manager.start();
    }

    @Click
    public void pause() {
        Log.d(TAG, "pause");
        manager.pause();
    }

    @Click
    public void stop() {
        Log.d(TAG, "stop");
        manager.stop();
    }

    @Background
    public void load() {
        Episode episode = Episode.deserialize(json);
        Stream stream = radioHandler.getStream(episode);

        manager.prepare(stream.getUrl());

        Log.d(TAG, "load done");
    }
}
