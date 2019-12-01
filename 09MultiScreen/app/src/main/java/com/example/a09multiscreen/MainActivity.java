package com.example.a09multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn1=(Button)findViewById(R.id.btnhal1);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent i = null;
                i= new Intent(getApplicationContext(),Halaman1.class);
                startActivity(i);
            }
        });

         btn2=(Button)findViewById(R.id.btnhal2);
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent i = null;
                i= new Intent(getApplicationContext(),Halaman2.class);
                startActivity(i);
            }
        });

         btn3=(Button)findViewById(R.id.btnhal3);
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent i = null;
                i= new Intent(getApplicationContext(),Halaman3.class);
                startActivity(i);
            }
        });

        btn4=(Button)findViewById(R.id.btnhal4);
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent i = null;
                i= new Intent(getApplicationContext(),Halaman4.class);
                startActivity(i);
            }
        });

    }
}
