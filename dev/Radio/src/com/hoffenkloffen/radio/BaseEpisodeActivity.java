package com.hoffenkloffen.radio;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.player.IMediaPlayerFacade;
import com.hoffenkloffen.radio.player.MediaPlayerFacade;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import com.hoffenkloffen.radio.utils.ILogFacade;
import com.hoffenkloffen.radio.utils.LogFacade;
import io.vov.vitamio.MediaPlayer;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public abstract class BaseEpisodeActivity extends Activity {

    private static final String TAG = BaseEpisodeActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    private MediaPlayerManager manager;

    @ViewById
    protected TextView text;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        radioHandler = getRadioHandler();

        Episode episode = getEpisode();
        Stream stream = radioHandler.getStream(episode);

        ILogFacade log = new LogFacade();
        MediaPlayer player = new MediaPlayer(this);
        IMediaPlayerFacade facade = new MediaPlayerFacade(player);

        manager = new MediaPlayerManager(log, facade, stream.getUrl());
        manager.prepare();
    }

    protected abstract RadioHandler getRadioHandler();

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
