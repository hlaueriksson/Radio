package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Intent;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Resource;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.utils.ISimpleLogFacade;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

import java.util.List;

import static com.hoffenkloffen.radio.fragments.ResourceListFragment.ResourceListEventHandler;

@EActivity
public abstract class BaseStationActivity extends Activity implements ResourceListEventHandler {

    @Inject
    private ISimpleLogFacade log;

    @Inject
    private RadioHandler radioHandler;

    @Extra(Constants.Station)
    public String json;

    //region ResourceListEventHandler
    public List<? extends Resource> getResourceList() {
        Station station = Station.deserialize(json);
        return radioHandler.getPrograms(station);
    }

    public void onResourceSelected(Resource resource) {
        openProgram((Program) resource);
    }
    //endregion

    protected abstract Intent getNextActivityIntent();

    private void openProgram(Program program) {
        log.i("openProgram: " + program.getName());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Program, program.serialize());

        startActivity(intent);
    }
}
