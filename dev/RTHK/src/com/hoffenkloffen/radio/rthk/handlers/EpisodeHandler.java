package com.hoffenkloffen.radio.rthk.handlers;

import android.net.Uri;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.SourceType;
import com.hoffenkloffen.radio.utils.Downloader;
import com.hoffenkloffen.radio.utils.EpisodeParser;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpisodeHandler {

    private Downloader downloader;
    private EpisodeParser parser;

    public EpisodeHandler() {
        downloader = new Downloader();
        parser = new EpisodeParser();
    }

    public boolean isValid(Uri uri) {
        return uri != null && getSourceType(uri) == SourceType.FILE;
    }

    public Episode getEpisode(Uri uri) {

        InputStream stream = downloader.getInputStream(uri);

        return parser.parse(stream);
    }

    private SourceType getSourceType(Uri uri) {
        if (uri == null) return SourceType.NONE;

        String url = uri.toString();

        if (url.matches("http://www.rthk.org.hk/.*\\.asx")) return SourceType.FILE;
        if (url.matches("http://programme.rthk.hk/channel/radio/programme.php\\?.*m=episode")) return SourceType.PAGE;

        return SourceType.NONE;
    }

    private Uri getUri(String page) {
        String pattern = "href=\"(http://www.rthk.org.hk/.*\\.asx)\"";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(page);

        if (!m.matches()) return null;

        return Uri.parse(m.group(1));
    }
}
