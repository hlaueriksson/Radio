package com.hoffenkloffen.radio.rthk.handlers;

import android.content.Context;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.IStationHandler;
import com.hoffenkloffen.radio.rthk.R;
import com.hoffenkloffen.radio.utils.ResourceLoader;

import java.util.List;

public class StationHandler implements IStationHandler {
    private final Context context;

    @Inject
    public StationHandler(Context context) {
        this.context = context;
    }

    public List<Station> getStations() {
        ResourceLoader loader = new ResourceLoader(context);
        String json = loader.readFileToString(R.raw.stations);

        return Station.deserializeList(json);
    }
}