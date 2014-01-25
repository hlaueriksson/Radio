package com.hoffenkloffen.radio.rthk;

import android.content.Intent;
import com.hoffenkloffen.radio.BaseProgramActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.Downloader;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.program)
public class ProgramActivity extends BaseProgramActivity {

    @Override
    protected RadioHandler getRadioHandler() {
        return new RadioHandler(null, null, new EpisodeHandler(new Downloader()), null);
    }

    @Override
    protected Intent getNextActivityIntent() {
        return EpisodeActivity_.intent(getApplicationContext()).get();
    }
}
