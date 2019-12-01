package com.example.a11audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpPlayer;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlay=(Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v ) {
                Uri myUri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jeda);
                mpPlayer = new MediaPlayer();
                mpPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mpPlayer.setDataSource(getApplicationContext(),myUri);
                } catch (IOException e) {
                    e.printStackTrace();
                }catch (IllegalArgumentException e){
                    Toast.makeText(getApplicationContext(), "You Might not set the URI correctly", Toast.LENGTH_SHORT).show();
                }catch (SecurityException e){
                    Toast.makeText(getApplicationContext(), "You Might not set the URI correctly", Toast.LENGTH_SHORT).show();
                }catch (IllegalStateException e){
                    Toast.makeText(getApplicationContext(), "You Might not set the URI correctly", Toast.LENGTH_SHORT).show();
                }
                try{
                    mpPlayer.prepare();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "You Might not set the URI correctly", Toast.LENGTH_SHORT).show();
                }catch (IllegalStateException e){
                    Toast.makeText(getApplicationContext(), "You Might not set the URI correctly", Toast.LENGTH_SHORT).show();
                }
                mpPlayer.start();
            }
        });
        Button btnStop=(Button)findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if(mpPlayer!=null && mpPlayer.isPlaying()){
                    mpPlayer.stop();
                }
            }
        });

        }
    }

