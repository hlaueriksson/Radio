package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseMainActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.StationHandler;
import com.hoffenkloffen.radio.rthk.handlers.StreamHandler;
import com.hoffenkloffen.radio.utils.Downloader;

public class MainActivity extends BaseMainActivity {

    @Override
    protected RadioHandler getRadioHandler() {
        return new RadioHandler(
                new StationHandler(getApplicationContext()),
                null,
                null,
                new StreamHandler(new Downloader()));
    }

    @Override
    protected Class<?> getStationActivityClass() {
        return StationActivity.class;
    }
}
