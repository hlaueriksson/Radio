package com.hoffenkloffen.radio.rthk.handlers;

import android.net.Uri;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.SourceType;
import com.hoffenkloffen.radio.utils.EpisodeParser;
import com.hoffenkloffen.radio.utils.IDownloader;
import com.hoffenkloffen.radio.utils.IEpisodeHandler;
import com.hoffenkloffen.radio.utils.ILogFacade;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpisodeHandler implements IEpisodeHandler {

    private ILogFacade log;
    private IDownloader downloader;
    private EpisodeParser parser;

    public EpisodeHandler(ILogFacade log, IDownloader downloader) {
        this.log = log;
        this.downloader = downloader;
        parser = new EpisodeParser(log);
    }

    public boolean isValid(String uri) {
        return uri != null && getSourceType(uri) == SourceType.FILE;
    }

    public Episode getEpisode(String uri) {

        InputStream stream = downloader.getInputStream(uri);

        return parser.parse(stream);
    }

    private SourceType getSourceType(String uri) {
        if (uri == null) return SourceType.NONE;

        if (uri.matches("http://www.rthk.org.hk/.*\\.asx")) return SourceType.FILE;
        if (uri.matches("http://programme.rthk.hk/channel/radio/programme.php\\?.*m=episode")) return SourceType.PAGE;

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
