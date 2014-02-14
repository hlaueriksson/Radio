package com.hoffenkloffen.radio.rthk;

import android.content.Intent;
import com.hoffenkloffen.radio.BaseProgramActivity;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.RoboGuice;

@EActivity(R.layout.program)
@RoboGuice
public class ProgramActivity extends BaseProgramActivity {

    @Override
    protected Intent getNextActivityIntent() {
        return EpisodeActivity_.intent(getApplicationContext()).get();
    }
}
