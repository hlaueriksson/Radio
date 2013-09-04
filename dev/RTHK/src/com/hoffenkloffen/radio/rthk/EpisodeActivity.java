package com.hoffenkloffen.radio.rthk;

import android.util.Log;
import com.hoffenkloffen.radio.BaseEpisodeActivity;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.Downloader;
import com.hoffenkloffen.radio.utils.IDownloader;
import com.hoffenkloffen.radio.utils.ILogFacade;
import com.hoffenkloffen.radio.utils.LogFacade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpisodeActivity extends BaseEpisodeActivity {

    private static final String TAG = EpisodeActivity.class.getSimpleName();

    private String response;

    @Override
    protected String getInfo() {

        download();

        return getInfo(response);
    }

    @Override
    protected Stream getStream() {

        return getStream(response);
    }

    private void download() {

        Downloader downloader = new Downloader();
        response = downloader.getResponse(episode.getUrl());
    }

    private String getInfo(String response) {
        StringBuilder sb = new StringBuilder();

        String pattern = "<h3>(.*?)</h3>"; // Name
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(response);
        if (m.find()) sb.append(m.group(1));

        pattern = "<div id=\"epi-text\">\\s*(.*?)\\s*</div>"; // Description
        p = Pattern.compile(pattern);
        m = p.matcher(response);
        if (m.find()) sb.append(m.group(1));

        return sb.toString();
    }

    private Stream getStream(String response) {

        ILogFacade log = new LogFacade();
        IDownloader downloader = new Downloader();
        EpisodeHandler episodeHandler = new EpisodeHandler(log, downloader);

        String url = episodeHandler.getUri(response);
        Episode episode = episodeHandler.getEpisode(url);

        Stream stream = new Stream();
        stream.setUrl(episode.getUrl());

        return stream;
    }
}
