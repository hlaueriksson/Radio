package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Resource;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.fragments.ResourceListFragment;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.utils.ISimpleLogFacade;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

import java.util.List;

import static com.hoffenkloffen.radio.fragments.ResourceListFragment.ResourceListEventHandler;

@EActivity
public abstract class BaseMainActivity extends Activity implements ResourceListEventHandler {

    @Inject
    private ISimpleLogFacade log;

    @Inject
    private RadioHandler radioHandler;

    @FragmentById
    protected ResourceListFragment resourceListFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)) return;
    }

    //region ResourceListEventHandler
    public List<? extends Resource> getResourceList() {
        return radioHandler.getStations();
    }

    public void onResourceSelected(Resource resource) {
        openStation((Station) resource);
    }
    //endregion

    protected abstract Intent getNextActivityIntent();

    private void openStation(Station station) {
        log.i("openStation: " + station.getName());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Station, station.serialize());

        startActivity(intent);
    }
}
