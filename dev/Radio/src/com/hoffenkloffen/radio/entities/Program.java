package com.hoffenkloffen.radio.entities;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Program extends Resource {

    private String station;

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String serialize() {
        Gson gson = new Gson();

        return gson.toJson(this);
    }

    public static Program deserialize(String value) {
        Gson gson = new Gson();

        return gson.fromJson(value, Program.class);
    }

    public static List<Program> deserializeList(String value) {
        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<Program>>() {
        }.getType();

        return gson.fromJson(value, type);
    }
}
