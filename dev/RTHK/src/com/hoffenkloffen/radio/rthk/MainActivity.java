package com.hoffenkloffen.radio.rthk;

import android.content.Intent;
import com.hoffenkloffen.radio.BaseMainActivity;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.RoboGuice;

@EActivity(R.layout.main)
@RoboGuice
public class MainActivity extends BaseMainActivity {

    @Override
    protected Intent getNextActivityIntent() {
        return StationActivity_.intent(getApplicationContext()).get();
    }
}
