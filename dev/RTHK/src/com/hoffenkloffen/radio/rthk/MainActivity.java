package com.hoffenkloffen.radio.rthk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.hoffenkloffen.radio.EpisodeActivity;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.Downloader;
import com.hoffenkloffen.radio.utils.IDownloader;
import com.hoffenkloffen.radio.utils.ILogFacade;
import com.hoffenkloffen.radio.utils.LogFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private EpisodeHandler episodeHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)) return;

        final ListView listview = (ListView) findViewById(R.id.listview);

        String json = readFileToString(R.raw.stations);
        List<Station> stations = Station.deserializeList(json);

        StationAdapter adapter = new StationAdapter(this, R.layout.main_list_item_station, stations);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                Station station = (Station) parent.getItemAtPosition(position);

                openStation(station);
            }
        });

        ILogFacade log = new LogFacade();
        IDownloader downloader = new Downloader();

        episodeHandler = new EpisodeHandler(log, downloader);

        startFromUri();
    }

    private void openStation(Station station) {
        Log.i(TAG, "openStation: " + station.getName());

        open(station.getUrl());
    }

    private void open(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    private void startFromUri() {
        if (!isViewAction()) return;

        Uri uri = getIntent().getData();

        if (!episodeHandler.isValid(uri.toString())) return;

        Episode episode = episodeHandler.getEpisode(uri.toString());

        if (episode == null) return;

        Log.d(TAG, "startFromUri");

        start(episode);
    }

    private void start(Episode episode) {
        Intent intent = new Intent(getBaseContext(), EpisodeActivity.class);
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }

    private boolean isViewAction() {
        String action = getIntent().getAction();

        return Intent.ACTION_VIEW.equals(action);
    }

    protected String readFileToString(int resId) {
        StringBuilder result = new StringBuilder();

        InputStream stream = getResources().openRawResource(resId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;

        try {
            if (stream != null) {
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
            }
            stream.close();
        } catch (IOException ex) {
            Log.e(TAG, "Read file failed.", ex);
        }

        return result.toString();
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
