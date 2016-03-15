package com.daniel.eirik.assistant;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;


public class WeatherCast extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.castweather);

        WebView view=(WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new ShouldOverrideUrl());
        view.loadUrl("http://www.yr.no/sted/Norge/Buskerud/Nedre_Eiker/Solbergelva/langtidsvarsel.html");
    }


    public void chrome(View view) {
        Intent chrome = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
        startActivity(chrome);
    }

    private class ShouldOverrideUrl extends WebViewClient implements MyBrowser {

        @Override
        public boolean ShouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}







