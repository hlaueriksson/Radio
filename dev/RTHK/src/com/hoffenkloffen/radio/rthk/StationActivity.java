package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseStationActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.ProgramHandler;

public class StationActivity extends BaseStationActivity {

    @Override
    protected RadioHandler getRadioHandler() {
        return new RadioHandler(null, new ProgramHandler(getApplicationContext()), null, null);
    }

    @Override
    protected Class<?> getProgramActivityClass() {
        return ProgramActivity.class;
    }
}
