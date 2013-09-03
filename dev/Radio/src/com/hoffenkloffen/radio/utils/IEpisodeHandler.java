package com.hoffenkloffen.radio.utils;

import com.hoffenkloffen.radio.entities.Episode;

public interface IEpisodeHandler {
    boolean isValid(String uri);

    Episode getEpisode(String uri);
}
