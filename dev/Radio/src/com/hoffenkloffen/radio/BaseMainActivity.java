package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Resource;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.fragments.ResourceListFragment;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

import java.util.List;

import static com.hoffenkloffen.radio.fragments.ResourceListFragment.ResourceListEventHandler;

@EActivity
public abstract class BaseMainActivity extends Activity implements ResourceListEventHandler {

    private static final String TAG = BaseMainActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    @FragmentById
    protected ResourceListFragment resourceListFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)) return;

        radioHandler = getRadioHandler();

        //startFromUri();
    }

    //region ResourceListEventHandler
    public List<? extends Resource> getResourceList() {
        return radioHandler.getStations();
    }

    public void onResourceSelected(Resource resource) {
        openStation((Station) resource);
    }
    //endregion

    protected abstract RadioHandler getRadioHandler();

    protected abstract Intent getNextActivityIntent();

    private void openStation(Station station) {
        Log.i(TAG, "openStation: " + station.getName());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Station, station.serialize());

        startActivity(intent);
    }

    /*
    private void startFromUri() { // TODO: this should handle main, station, program, episode
        if (!isViewAction()) return;

        Uri uri = getIntent().getData();

        if (!episodeHandler.isValid(uri.toString())) return;

        Episode episode = episodeHandler.getEpisode(uri.toString());

        if (episode == null) return;

        Log.d(TAG, "startFromUri");

        start(episode);
    }
    */

    private void start(Episode episode) {
        Intent intent = new Intent(getBaseContext(), BaseEpisodeActivity.class);
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }

    private boolean isViewAction() {
        String action = getIntent().getAction();

        return Intent.ACTION_VIEW.equals(action);
    }
}
