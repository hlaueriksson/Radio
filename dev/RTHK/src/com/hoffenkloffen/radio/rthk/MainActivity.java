package com.hoffenkloffen.radio.rthk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.hoffenkloffen.radio.EpisodeActivity;
import com.hoffenkloffen.radio.config.Constants;
import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.Downloader;
import com.hoffenkloffen.radio.utils.IDownloader;
import com.hoffenkloffen.radio.utils.ILogFacade;
import com.hoffenkloffen.radio.utils.LogFacade;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private EpisodeHandler episodeHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)) return;

        ILogFacade log = new LogFacade();
        IDownloader downloader = new Downloader();

        episodeHandler = new EpisodeHandler(log, downloader);

        startFromUri();
    }

    public void openStation(View view) {
        Button button = (Button) view;
        String url = button.getHint().toString();

        open(url);
    }

    private void open(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    private void startFromUri() {
        if (!isViewAction()) return;

        Uri uri = getIntent().getData();

        if (!episodeHandler.isValid(uri.toString())) return;

        Episode episode = episodeHandler.getEpisode(uri.toString());

        if (episode == null) return;

        Log.d(TAG, "startFromUri");

        start(episode);
    }

    private void start(Episode episode) {
        Intent intent = new Intent(getBaseContext(), EpisodeActivity.class);
        intent.putExtra(Constants.Episode, episode.serialize());

        startActivity(intent);
    }

    private boolean isViewAction() {
        String action = getIntent().getAction();

        return Intent.ACTION_VIEW.equals(action);
    }
}
