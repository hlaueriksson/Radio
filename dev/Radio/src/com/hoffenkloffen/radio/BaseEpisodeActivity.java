package com.hoffenkloffen.radio;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import com.hoffenkloffen.radio.utils.ISimpleLogFacade;
import com.hoffenkloffen.radio.utils.LogFacade;
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
    protected ProgressBar progress;

    @ViewById
    protected ImageButton play, pause;

    @ViewById
    protected TextView text;

    @Extra(Constants.Episode)
    public String json;

    @AfterInject
    public void init() {
        load();
    }

    @AfterViews
    public void render() { // TODO: introduce state machine
        progress.setVisibility(View.VISIBLE);
        play.setVisibility(View.GONE);
        pause.setVisibility(View.GONE);
    }

    @Click
    @Trace(tag = LogFacade.TAG)
    public void play() {
        manager.start();

        play.setVisibility(View.GONE);
        pause.setVisibility(View.VISIBLE);
    }

    @Click
    @Trace(tag = LogFacade.TAG)
    public void pause() {
        manager.pause();

        play.setVisibility(View.VISIBLE);
        pause.setVisibility(View.GONE);
    }

    @Background
    public void load() {
        Episode episode = Episode.deserialize(json);
        Stream stream = radioHandler.getStream(episode);

        manager.prepare(stream.getUrl());

        update();
    }

    @UiThread
    public void update() {
        progress.setVisibility(View.GONE);
        play.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        manager.release();
    }
}
