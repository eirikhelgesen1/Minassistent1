package com.daniel.eirik.assistant;

import android.webkit.WebView;

/**
 * Created by Eirik on 14/03/2016.
 */
public interface MyBrowser {
    boolean ShouldOverrideUrlLoading(WebView view, String url);
}
