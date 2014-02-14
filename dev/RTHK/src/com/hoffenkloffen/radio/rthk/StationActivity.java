package com.hoffenkloffen.radio.rthk;

import android.content.Intent;
import com.hoffenkloffen.radio.BaseStationActivity;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.RoboGuice;

@EActivity(R.layout.station)
@RoboGuice
public class StationActivity extends BaseStationActivity {

    @Override
    protected Intent getNextActivityIntent() {
        return ProgramActivity_.intent(getApplicationContext()).get();
    }
}
