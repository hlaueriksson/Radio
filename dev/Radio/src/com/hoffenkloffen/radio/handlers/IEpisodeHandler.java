package com.hoffenkloffen.radio.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;

import java.util.List;

public interface IEpisodeHandler {
    List<Episode> getEpisodes(Program program);
}

