package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Resource;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import org.androidannotations.annotations.EActivity;

import java.util.List;

import static com.hoffenkloffen.radio.fragments.ResourceListFragment.ResourceListEventHandler;

@EActivity
public abstract class BaseProgramActivity extends Activity implements ResourceListEventHandler {

    private static final String TAG = BaseProgramActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        radioHandler = getRadioHandler();
    }

    //region ResourceListEventHandler
    public List<? extends Resource> getResourceList() {
        Program program = getProgram();
        return radioHandler.getEpisodes(program);
    }

    public void onResourceSelected(Resource resource) {
        openEpisode((Episode) resource);
    }
    //endregion

    protected abstract RadioHandler getRadioHandler();

    protected abstract Intent getNextActivityIntent();

    private Program getProgram() {
        Bundle extras = getIntent().getExtras();
        String value = extras.getString(Constants.Program);

        return Program.deserialize(value);
    }

    private void openEpisode(Episode episode) {
        Log.i(TAG, "openEpisode: " + episode.getUrl());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }
}
