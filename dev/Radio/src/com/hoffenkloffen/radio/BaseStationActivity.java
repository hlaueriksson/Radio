package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Resource;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

import java.util.List;

import static com.hoffenkloffen.radio.fragments.ResourceListFragment.ResourceListEventHandler;

@EActivity
public abstract class BaseStationActivity extends Activity implements ResourceListEventHandler {

    private static final String TAG = BaseStationActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    @Extra(Constants.Station)
    public String json;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        radioHandler = getRadioHandler();
    }

    //region ResourceListEventHandler
    public List<? extends Resource> getResourceList() {
        Station station = Station.deserialize(json);
        return radioHandler.getPrograms(station);
    }

    public void onResourceSelected(Resource resource) {
        openProgram((Program) resource);
    }
    //endregion

    protected abstract RadioHandler getRadioHandler();

    protected abstract Intent getNextActivityIntent();

    private void openProgram(Program program) {
        Log.i(TAG, "openProgram: " + program.getName());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Program, program.serialize());

        startActivity(intent);
    }
}
