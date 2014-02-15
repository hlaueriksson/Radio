package com.hoffenkloffen.radio.rthk;

import com.google.inject.Module;
import com.hoffenkloffen.radio.handlers.*;
import com.hoffenkloffen.radio.player.IMediaPlayerFacade;
import com.hoffenkloffen.radio.player.MediaPlayerFacade;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.rthk.handlers.ProgramHandler;
import com.hoffenkloffen.radio.rthk.handlers.StationHandler;
import com.hoffenkloffen.radio.rthk.handlers.StreamHandler;
import com.hoffenkloffen.radio.utils.*;
import roboguice.application.RoboApplication;
import roboguice.config.AbstractAndroidModule;

import java.util.List;

public class MainApplication extends RoboApplication {

    @Override
    protected void addApplicationModules(List<Module> modules) {
        modules.add(new MainModule());
    }

    static class MainModule extends AbstractAndroidModule {
        @Override
        protected void configure() {
            bind(RadioHandler.class).asEagerSingleton();

            bind(MediaPlayerManager.class); // Lazy
            bind(IMediaPlayerFacade.class).to(MediaPlayerFacade.class);

            bind(IEpisodeHandler.class).to(EpisodeHandler.class);
            bind(IProgramHandler.class).to(ProgramHandler.class);
            bind(IStationHandler.class).to(StationHandler.class);
            bind(IStreamHandler.class).to(StreamHandler.class);

            bind(IDownloader.class).to(Downloader.class);

            bind(ILogFacade.class).to(LogFacade.class);
            bind(ISimpleLogFacade.class).to(LogFacade.class);
        }
    }
}
