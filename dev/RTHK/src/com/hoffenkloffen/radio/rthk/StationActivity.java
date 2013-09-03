package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseStationActivity;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.utils.ResourceLoader;

import java.util.ArrayList;
import java.util.List;

public class StationActivity extends BaseStationActivity {

    @Override
    protected List<Program> getPrograms() {
        ResourceLoader loader = new ResourceLoader(getApplicationContext());
        String json = loader.readFileToString(R.raw.programs);

        List<Program> programs = Program.deserializeList(json);
        List<Program> result = new ArrayList<Program>();

        for (Program program : programs) {
            if(program.getStation().equals(getStationId())) result.add(program);
        }

        return result;
    }

    private String getStationId() {

        if(station.getUrl().endsWith("r1")) return "radio1"; // TODO: fix this
        if(station.getUrl().endsWith("r2")) return "radio2";
        if(station.getUrl().endsWith("r3")) return "radio3";
        if(station.getUrl().endsWith("r4")) return "radio4";
        if(station.getUrl().endsWith("r5")) return "radio5";
        if(station.getUrl().endsWith("rpth")) return "pth";

        return null;
    }
}