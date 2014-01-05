package com.hoffenkloffen.radio.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;

public interface IStreamHandler {
    Stream getStream(Episode episode);
}
