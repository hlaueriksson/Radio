package com.hoffenkloffen.radio.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;

public interface IStreamStrategy {
    Stream getStream(String content);
}
