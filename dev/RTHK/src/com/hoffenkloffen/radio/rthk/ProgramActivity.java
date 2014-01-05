package com.hoffenkloffen.radio.rthk;

import com.hoffenkloffen.radio.BaseProgramActivity;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.utils.Downloader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramActivity extends BaseProgramActivity {

    @Override
    protected List<Episode> getEpisodes() {

        String url = program.getUrl() + "&m=archive&page=1&item=100"; // Last 100 episodes

        Downloader downloader = new Downloader();
        String response = downloader.getResponse(url);

        return getEpisodes(response);
    }

    @Override
    protected Class<?> getEpisodeActivityClass() {
        return EpisodeActivity.class;
    }

    private List<Episode> getEpisodes(String response) {
        List<Episode> result = new ArrayList<Episode>();

        String pattern = "<a href=\"(programme.php.*?m=episode)\">(.*?)</a>";

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
}
