package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseMainActivity;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.*;

import java.util.List;

public class MainActivity extends BaseMainActivity {

    @Override
    protected IEpisodeHandler getEpisodeHandler() {
        ILogFacade log = new LogFacade();
        IDownloader downloader = new Downloader();

        return new EpisodeHandler(log, downloader);
    }

    @Override
    protected List<Station> getStations() {
        ResourceLoader loader = new ResourceLoader(getApplicationContext());
        String json = loader.readFileToString(R.raw.stations);

        return Station.deserializeList(json);
    }

    @Override
    protected Class<?> getStationActivityClass() {
        return StationActivity.class;
    }
}
