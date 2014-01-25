package com.hoffenkloffen.radio.rthk;

import android.content.Intent;
import com.hoffenkloffen.radio.BaseMainActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.StationHandler;
import com.hoffenkloffen.radio.rthk.handlers.StreamHandler;
import com.hoffenkloffen.radio.utils.Downloader;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.main)
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
    protected Intent getNextActivityIntent() {
        return StationActivity_.intent(getApplicationContext()).get();
    }
}
