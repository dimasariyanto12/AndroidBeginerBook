package com.example.a07popupmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import  android.view.MenuItem;
import  android.view.Menu;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnMenuItemClickListener {
    TextView teksMenu;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksMenu=(TextView)findViewById(R.id.teksMenu);
        Button btnPopUp=(Button)findViewById(R.id.btnPopUp);
        btnPopUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                PopupMenu menuPopUp= new PopupMenu(MainActivity.this,v);
                menuPopUp.setOnMenuItemClickListener(MainActivity.this);
                menuPopUp.inflate(R.menu.menu_main);
                menuPopUp.show();

            }
        });

    }
    public boolean onMenuItemClick(MenuItem item){
        switch (item.getItemId()){
            case  R.id.menuSatu:
                teksMenu.setText("Ini Menu Satu");
                return  true;

            case  R.id.menuDua:
                teksMenu.setText("Ini Menu Dua");
                return  true;
            case R.id.menuTiga:
                teksMenu.setText("Ini Menu Tiga");
            case  R.id.Share:
                Intent shara= new Intent(Intent.ACTION_SEND);
                shara.setType("text/plain");
                shara.putExtra(Intent.EXTRA_SUBJECT,"Bagikan ke teman anda");
                shara.putExtra(Intent.EXTRA_TEXT,"dimasjepara.blogspot.com");
                startActivity(Intent.createChooser(shara,"Share Link!"));

        }
        return  true;
    }
}
