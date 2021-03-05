package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Artikel(View view) {
        Intent moveToArtikel = new Intent(MainActivity.this,Artikel.class);
        startActivity(moveToArtikel);
        moveToArtikel.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }

    public void Biodata(View view) {
        Intent moveToBiodata = new Intent(MainActivity.this, Biodata.class);
        startActivity(moveToBiodata);
        moveToBiodata.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }
}