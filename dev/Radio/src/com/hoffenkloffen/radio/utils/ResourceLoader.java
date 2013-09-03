package com.hoffenkloffen.radio.utils;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceLoader {

    private static final String TAG = ResourceLoader.class.getSimpleName();

    private Context context;

    public ResourceLoader(Context context) {
        this.context = context;
    }

    public String readFileToString(int resId) {
        StringBuilder result = new StringBuilder();

        InputStream stream = context.getResources().openRawResource(resId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;

        try {
            if (stream != null) {
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
            }
            stream.close();
        } catch (IOException ex) {
            Log.e(TAG, "Read file failed.", ex);
        }

        return result.toString();
    }
}
