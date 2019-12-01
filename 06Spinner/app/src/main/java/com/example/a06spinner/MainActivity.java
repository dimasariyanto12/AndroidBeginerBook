package com.example.a06spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import  android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import  android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    TextView teksPilih;
    private Spinner sp_negara;
    private String[]list={"-Pilih Negara-","Amerika","Indonesia","Malaysia","Philiphina","India","Arab Saudi","Afrika Utara","Brunei Darusalam","Singapore"};

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksPilih=(TextView)findViewById(R.id.textView);

        sp_negara =(Spinner)findViewById(R.id.spinner);
        sp_negara.setOnItemSelectedListener(this);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_negara.setAdapter(adapter);

    }
    @Override
    public void onItemSelected( AdapterView<?> parent, View argl, int posisi ,long arg3 ) {
    teksPilih.setText(list[posisi]);
    }

    @Override
    public void onNothingSelected( AdapterView arg0 ) {
    teksPilih.setText(" ");
    }
}
