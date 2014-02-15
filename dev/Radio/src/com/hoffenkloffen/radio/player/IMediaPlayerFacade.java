package com.hoffenkloffen.radio.player;

import java.io.IOException;

public interface IMediaPlayerFacade {

    void setDataSource(String path) throws IOException;

    void prepare() throws IOException;

    void start();

    void pause();

    void stop();

    boolean isPlaying();

    void release();
}
