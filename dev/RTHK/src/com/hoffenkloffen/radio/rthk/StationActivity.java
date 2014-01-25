package com.hoffenkloffen.radio.rthk;

import android.content.Intent;
import com.hoffenkloffen.radio.BaseStationActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.ProgramHandler;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.station)
public class StationActivity extends BaseStationActivity {

    @Override
    protected RadioHandler getRadioHandler() {
        return new RadioHandler(null, new ProgramHandler(getApplicationContext()), null, null);
    }

    @Override
    protected Intent getNextActivityIntent() {
        return ProgramActivity_.intent(getApplicationContext()).get();
    }
}
