package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseEpisodeActivity;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import com.hoffenkloffen.radio.rthk.handlers.StreamHandler;
import com.hoffenkloffen.radio.utils.Downloader;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.episode)
public class EpisodeActivity extends BaseEpisodeActivity {

    @Override
    protected RadioHandler getRadioHandler() {
        return new RadioHandler(null, null, null, new StreamHandler(new Downloader()));
    }
}
