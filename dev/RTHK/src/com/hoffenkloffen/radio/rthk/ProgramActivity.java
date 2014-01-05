package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseProgramActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.Downloader;

public class ProgramActivity extends BaseProgramActivity {

    @Override
    protected RadioHandler getRadioHandler() {
        return new RadioHandler(null, null, new EpisodeHandler(new Downloader()), null);
    }

    @Override
    protected Class<?> getEpisodeActivityClass() {
        return EpisodeActivity.class;
    }
}
