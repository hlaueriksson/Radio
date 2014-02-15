package com.hoffenkloffen.radio.entities;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Station extends Resource {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String serialize() {
        Gson gson = new Gson();

        return gson.toJson(this);
    }

    public static Station deserialize(String value) {
        Gson gson = new Gson();

        return gson.fromJson(value, Station.class);
    }

    public static List<Station> deserializeList(String value) {
        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<Station>>() {
        }.getType();

        return gson.fromJson(value, type);
    }
}
