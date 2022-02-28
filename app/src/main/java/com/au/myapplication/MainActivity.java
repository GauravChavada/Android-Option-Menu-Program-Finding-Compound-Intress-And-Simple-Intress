package com.au.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText pa,rof,noy;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pa=findViewById(R.id.pa);
        rof=findViewById(R.id.rof);
        noy=findViewById(R.id.noy);
        tv=findViewById(R.id.tv1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        double p=Double.parseDouble(pa.getText().toString());
        double i=Double.parseDouble(rof.getText().toString());
        double n=Double.parseDouble(noy.getText().toString());
        double simpleintrest = (p * i * n) / 100;
        double compoundintrest =p*Math.pow(( 1 + i/100),n) - p;
        switch (item.getItemId())
        {
            case R.id.comin:
                tv.setText("Compound Intrest"+String.valueOf(compoundintrest));
                return true;

            case R.id.simin:
                tv.setText("Simple Intrest"+String.valueOf(simpleintrest));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}