package com.hoffenkloffen.radio.utils;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Downloader {

    private static final String TAG = "Downloader";

    public InputStream getInputStream(final Uri uri) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build(); // TODO: fix this
        StrictMode.setThreadPolicy(policy);

        try {
            URL url = new URL(uri.toString());

            return url.openStream();
        } catch (IOException e) {
            Log.e(TAG, "Get InputStream failed.", e);
        }

        return null;
    }

    private String getResponse(Uri uri) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build(); // TODO: fix this
        StrictMode.setThreadPolicy(policy);

        HttpClient httpClient = new DefaultHttpClient();

        try {
            HttpGet httpGet = new HttpGet(uri.toString());

            ResponseHandler<String> responseHandler = new BasicResponseHandler();

            return httpClient.execute(httpGet, responseHandler);
        } catch (IOException e) {
            Log.e(TAG, "Get response failed.", e);
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        return null;
    }
}
