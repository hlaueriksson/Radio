package com.hoffenkloffen.radio.entities;

import com.google.gson.Gson;

public class Episode extends Resource {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String serialize() {
        Gson gson = new Gson();

        return gson.toJson(this);
    }

    public static Episode deserialize(String value) {
        Gson gson = new Gson();

        return gson.fromJson(value, Episode.class);
    }
}
