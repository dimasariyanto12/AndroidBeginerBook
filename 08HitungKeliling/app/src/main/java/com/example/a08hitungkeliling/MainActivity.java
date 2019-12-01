package com.example.a08hitungkeliling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editSisi,edtKeliling;
    private Button btnKeliling;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
        initEvent();
    }



    private void initUi() {
        editSisi=(EditText)findViewById(R.id.editTextSisi);
        edtKeliling=(EditText)findViewById(R.id.editTextKeliling);
        btnKeliling=(Button)findViewById(R.id.buttonHitungkeliling);
    }

    private void initEvent() {
        btnKeliling.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick( View v ) {
                hitungLuas();
            }
        });
    }
    private void hitungLuas(){
        int sisi= Integer.parseInt(editSisi.getText().toString());
        int keliling=4* sisi;
        edtKeliling.setText("keliling Persegi (4*Sisi) =  :"+keliling+"");
    }

    public boolean onCreateOptionsMenu( Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item ){
        int id=item.getItemId();
        if (id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
