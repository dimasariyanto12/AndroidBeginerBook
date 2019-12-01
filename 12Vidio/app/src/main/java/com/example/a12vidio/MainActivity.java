package com.example.a12vidio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView vidioV;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        vidioV=(VideoView)findViewById(R.id.vidioView);
        vidioV.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vidio1));
        vidioV.setMediaController(new MediaController(this));
        vidioV.requestFocus();
        vidioV.start();
    }

    public void onConfigurationChanged(Configuration newConfig ){
        super.onConfigurationChanged(newConfig);
    }
}
