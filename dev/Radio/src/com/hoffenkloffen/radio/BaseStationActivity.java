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
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.RadioHandler;

import java.util.List;

public abstract class BaseStationActivity extends Activity {

    private static final String TAG = BaseStationActivity.class.getSimpleName();

    private RadioHandler radioHandler;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station);

        radioHandler = getRadioHandler();

        Station station = getStation();

        List<Program> programs = radioHandler.getPrograms(station);

        ListView listview = (ListView) findViewById(R.id.listview);
        ProgramAdapter adapter = new ProgramAdapter(this, R.layout.station_list_item_program, programs);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                Program program = (Program) parent.getItemAtPosition(position);

                openProgram(program);
            }
        });
    }

    protected abstract RadioHandler getRadioHandler();

    protected abstract Class<?> getProgramActivityClass();

    private Station getStation() {
        Bundle extras = getIntent().getExtras();
        String value = extras.getString(Constants.Station);

        return Station.deserialize(value);
    }

    private void openProgram(Program program) {
        Log.i(TAG, "openProgram: " + program.getName());

        Intent intent = new Intent(getBaseContext(), getProgramActivityClass());
        intent.putExtra(Constants.Program, program.serialize());

        startActivity(intent);
    }

    private class ProgramAdapter extends ArrayAdapter<Program> {

        private int resource;

        public ProgramAdapter(Context context, int resource, List<Program> objects) {
            super(context, resource, objects);
            this.resource = resource;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(resource, null);
            }

            Program program = getItem(position);

            if (program == null) return view;

            TextView text = (TextView) view.findViewById(R.id.text);
            if (text != null) text.setText(program.getName());

            return view;
        }
    }
}
