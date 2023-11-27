package com.example.osbabonekontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kaydol extends AppCompatActivity {
    Button btntamam, btniptal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaydol);
        btntamam = (Button) findViewById(R.id.btnkayittamam);
        btniptal = (Button) findViewById(R.id.btnkayitiptal);
        btniptal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}