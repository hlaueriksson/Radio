package com.hoffenkloffen.radio;

import android.app.Activity;
import android.widget.TextView;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import com.hoffenkloffen.radio.utils.ISimpleLogFacade;
import org.androidannotations.annotations.*;

@EActivity
public abstract class BaseEpisodeActivity extends Activity {

    @Inject
    private ISimpleLogFacade log;

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
        log.d("play");
        manager.start();
    }

    @Click
    public void pause() {
        log.d("pause");
        manager.pause();
    }

    @Click
    public void stop() {
        log.d("stop");
        manager.stop();
    }

    @Background
    public void load() {
        Episode episode = Episode.deserialize(json);
        Stream stream = radioHandler.getStream(episode);

        manager.prepare(stream.getUrl());

        log.d("load done");
    }
}
