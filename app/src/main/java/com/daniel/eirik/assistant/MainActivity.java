package com.daniel.eirik.assistant;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Weather (View view){
        Intent intent = new Intent(this, WeatherCast.class);
        startActivity(intent);
    }


    public void chrome (View view){
        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
        startActivity(LaunchIntent);
    }

    public void CallIntent (View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:91244441"));
        startActivity(callIntent);
    }



}













