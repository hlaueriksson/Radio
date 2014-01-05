package com.hoffenkloffen.radio.rthk.handlers;

import android.content.Context;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.handlers.IProgramHandler;
import com.hoffenkloffen.radio.rthk.R;
import com.hoffenkloffen.radio.utils.ResourceLoader;

import java.util.ArrayList;
import java.util.List;

public class ProgramHandler implements IProgramHandler {

    private Context context;

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
            if (program.getStation().equals(getStationId(station))) result.add(program);
        }

        return result;
    }

    private String getStationId(Station station) {

        if (station.getUrl().endsWith("r1")) return "radio1"; // TODO: fix this
        if (station.getUrl().endsWith("r2")) return "radio2";
        if (station.getUrl().endsWith("r3")) return "radio3";
        if (station.getUrl().endsWith("r4")) return "radio4";
        if (station.getUrl().endsWith("r5")) return "radio5";
        if (station.getUrl().endsWith("rpth")) return "pth";

        return null;
    }
}