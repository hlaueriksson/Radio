package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Resource;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

import java.util.List;

import static com.hoffenkloffen.radio.fragments.ResourceListFragment.ResourceListEventHandler;

@EActivity
public abstract class BaseProgramActivity extends Activity implements ResourceListEventHandler {

    private static final String TAG = BaseProgramActivity.class.getSimpleName();

    @Inject
    private RadioHandler radioHandler;

    @Extra(Constants.Program)
    public String json;

    //region ResourceListEventHandler
    public List<? extends Resource> getResourceList() {
        Program program = Program.deserialize(json);
        return radioHandler.getEpisodes(program);
    }

    public void onResourceSelected(Resource resource) {
        openEpisode((Episode) resource);
    }
    //endregion

    protected abstract Intent getNextActivityIntent();

    private void openEpisode(Episode episode) {
        Log.i(TAG, "openEpisode: " + episode.getUrl());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }
}
