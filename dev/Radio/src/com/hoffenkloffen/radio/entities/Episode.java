package com.hoffenkloffen.radio.entities;

import com.google.gson.Gson;

public class Episode {

    private String url;
    private String title;
    private String description;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
