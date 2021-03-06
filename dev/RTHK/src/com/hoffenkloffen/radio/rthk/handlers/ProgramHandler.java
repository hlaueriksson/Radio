package com.hoffenkloffen.radio.rthk.handlers;

import android.content.Context;
import com.google.inject.Inject;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.IProgramHandler;
import com.hoffenkloffen.radio.rthk.R;
import com.hoffenkloffen.radio.utils.ResourceLoader;

import java.util.ArrayList;
import java.util.List;

public class ProgramHandler implements IProgramHandler {

    private final Context context;

    @Inject
    public ProgramHandler(Context context) {
        this.context = context;
    }

    @Override
    public List<Program> getPrograms(Station station) {
        ResourceLoader loader = new ResourceLoader(context);
        String json = loader.readFileToString(R.raw.programs);

        List<Program> programs = Program.deserializeList(json);
        List<Program> result = new ArrayList<Program>();

        for (Program program : programs) {
            if (program.getStation().equals(station.getId())) result.add(program);
        }

        return result;
    }
}