package com.hoffenkloffen.radio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.RadioHandler;

import java.util.List;

public abstract class BaseMainActivity extends Activity {

    private static final String TAG = BaseMainActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)) return;

        radioHandler = getRadioHandler();

        List<Station> stations = radioHandler.getStations();

        ListView listview = (ListView) findViewById(R.id.listview);
        StationAdapter adapter = new StationAdapter(this, R.layout.main_list_item_station, stations);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                Station station = (Station) parent.getItemAtPosition(position);

                openStation(station);
            }
        });

        //startFromUri();
    }

    protected abstract RadioHandler getRadioHandler();

    protected abstract Class<?> getStationActivityClass();

    private void openStation(Station station) {
        Log.i(TAG, "openStation: " + station.getName());

        Intent intent = new Intent(getBaseContext(), getStationActivityClass());
        intent.putExtra(Constants.Station, station.serialize());

        startActivity(intent);
    }

    /*
    private void startFromUri() { // TODO: this should handle main, station, program, episode
        if (!isViewAction()) return;

        Uri uri = getIntent().getData();

        if (!episodeHandler.isValid(uri.toString())) return;

        Episode episode = episodeHandler.getEpisode(uri.toString());

        if (episode == null) return;

        Log.d(TAG, "startFromUri");

        start(episode);
    }
    */

    private void start(Episode episode) {
        Intent intent = new Intent(getBaseContext(), BaseEpisodeActivity.class);
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }

    private boolean isViewAction() {
        String action = getIntent().getAction();

        return Intent.ACTION_VIEW.equals(action);
    }

    private class StationAdapter extends ArrayAdapter<Station> {

        public StationAdapter(Context context, int resource, List<Station> objects) {
            super(context, resource, objects);
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.main_list_item_station, null);
            }

            Station station = getItem(position);

            if (station == null) return view;

            TextView text = (TextView) view.findViewById(R.id.text);
            if (text != null) text.setText(station.getName());

            return view;
        }
    }
}
