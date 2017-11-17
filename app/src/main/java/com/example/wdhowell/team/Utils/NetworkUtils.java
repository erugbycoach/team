package com.example.wdhowell.team.Utils;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.net.Uri;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by wdhow on 11/16/2017.
 */

public class NetworkUtils {

    private static final String BASE_URL = "http://http://erugbycoach.com/json/player.json";

    static URL buildURL() {
        Uri uri = Uri.parse(BASE_URL).buildUpon().build();
        URL mUrl = null;

        try {
            mUrl = new URL(uri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return mUrl;
    }

    static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();
            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
