package com.hoffenkloffen.radio.rthk.handlers;

import com.google.inject.Inject;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.handlers.IEpisodeHandler;
import com.hoffenkloffen.radio.utils.IDownloader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpisodeHandler implements IEpisodeHandler {

    private final IDownloader downloader;

    @Inject
    public EpisodeHandler(IDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public List<Episode> getEpisodes(Program program) {
        String url = program.getUrl() + "&m=archive&page=1&item=100"; // Last 100 episodes

        String response = downloader.getResponse(url);

        return getEpisodes(response);
    }

    private List<Episode> getEpisodes(String response) {
        List<Episode> result = new ArrayList<Episode>();

        String pattern = "<div class=\"title\">.*<a href=\"(.*?)\">(.*?)</a>";
        // TODO: <div class="desc">(.*?)<a href=".*" class="link-more">

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(response);

        while (m.find()) {
            Episode episode = new Episode();
            episode.setUrl("http://programme.rthk.hk/channel/radio/" + m.group(1));
            episode.setName(m.group(2).trim());

            result.add(episode);
        }

        return result;
    }

    /*
    public String getEpisodeInfo(String response) {
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
    */
}