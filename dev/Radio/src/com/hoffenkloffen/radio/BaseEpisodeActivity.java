package com.hoffenkloffen.radio;

import android.app.Activity;
import android.util.Log;
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
import org.androidannotations.annotations.*;

@EActivity
public abstract class BaseEpisodeActivity extends Activity {

    private static final String TAG = BaseEpisodeActivity.class.getSimpleName(); // TODO: hide in log facade

    private RadioHandler radioHandler; // TODO: inject

    private MediaPlayerManager manager; // TODO: inject

    @ViewById
    protected TextView text;

    @Extra(Constants.Episode)
    public String json;

    @AfterInject
    public void init() {
        load();
    }

    protected abstract RadioHandler getRadioHandler();

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
        radioHandler = getRadioHandler();

        Episode episode = Episode.deserialize(json);
        Stream stream = radioHandler.getStream(episode);

        ILogFacade log = new LogFacade();
        MediaPlayer player = new MediaPlayer(this);
        IMediaPlayerFacade facade = new MediaPlayerFacade(player);

        manager = new MediaPlayerManager(log, facade, stream.getUrl()); // TODO: put in service
        manager.prepare();

        Log.d(TAG, "load done");
    }
}
