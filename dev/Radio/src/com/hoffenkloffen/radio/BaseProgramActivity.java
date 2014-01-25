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
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.handlers.RadioHandler;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

@EActivity
public abstract class BaseProgramActivity extends Activity {

    private static final String TAG = BaseProgramActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    @ViewById
    protected ListView listview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        radioHandler = getRadioHandler();
    }

    @AfterViews
    protected void initViews() {
        Program program = getProgram();
        List<Episode> episodes = radioHandler.getEpisodes(program);

        EpisodeAdapter adapter = new EpisodeAdapter(this, R.layout.program_list_item_episode, episodes);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                Episode episode = (Episode) parent.getItemAtPosition(position);

                openEpisode(episode);
            }
        });
    }

    protected abstract RadioHandler getRadioHandler();

    protected abstract Intent getNextActivityIntent();

    private Program getProgram() {
        Bundle extras = getIntent().getExtras();
        String value = extras.getString(Constants.Program);

        return Program.deserialize(value);
    }

    private void openEpisode(Episode episode) {
        Log.i(TAG, "openEpisode: " + episode.getUrl());

        Intent intent = getNextActivityIntent();
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }

    private class EpisodeAdapter extends ArrayAdapter<Episode> {

        private int resource;

        public EpisodeAdapter(Context context, int resource, List<Episode> objects) {
            super(context, resource, objects);
            this.resource = resource;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(resource, null);
            }

            Episode episode = getItem(position);

            if (episode == null) return view;

            TextView text = (TextView) view.findViewById(R.id.text);
            if (text != null) text.setText(episode.getName());

            return view;
        }
    }
}
