package com.example.a10listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[]menuItem={
            "Safari",
            "Camera",
            "Global",
            "Firefox",
            "Android Folder",
            "Cold war"
    };

    //gambar
    Integer[]menuImage={
            R.drawable.safari,
            R.drawable.camera,
            R.drawable.global,
            R.drawable.firefox,
            R.drawable.folder,
            R.drawable.twitter
    };
    ListView listView;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utama);

        CustomListAdapter adapter= new CustomListAdapter(this,menuItem,menuImage);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new OnItemClickListener() {
           @Override
           public void onItemClick( AdapterView<?> adapterView, View view, int position, long id ) {
               Toast.makeText(getApplicationContext(),"Yang di klik adalah posisi ke :"+position,Toast.LENGTH_LONG).show();
           }
       });
    }
}
