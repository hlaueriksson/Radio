package com.hoffenkloffen.radio.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.entities.Stream;

import java.util.List;

public class RadioHandler {

    private IStationHandler stationHandler;
    private IProgramHandler programHandler;
    private IEpisodeHandler episodeHandler;
    private IStreamHandler streamHandler;

    public RadioHandler(IStationHandler stationHandler, IProgramHandler programHandler, IEpisodeHandler episodeHandler, IStreamHandler streamHandler) {

        this.stationHandler = stationHandler;
        this.programHandler = programHandler;
        this.episodeHandler = episodeHandler;
        this.streamHandler = streamHandler;
    }

    public List<Station> getStations() {
        return stationHandler.getStations();
    }

    public List<Program> getPrograms(Station station) {
        return programHandler.getPrograms(station);
    }

    public List<Episode> getEpisodes(Program program) {
        return episodeHandler.getEpisodes(program);
    }

    public Stream getStream(Episode episode) {
        return streamHandler.getStream(episode);
    }
}
