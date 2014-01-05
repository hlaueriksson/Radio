package com.hoffenkloffen.radio.handlers;

import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Station;

import java.util.List;

public interface IProgramHandler {
    List<Program> getPrograms(Station station);
}
