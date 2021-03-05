package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void Beranda(View view) {
        Intent moveToBeranda = new Intent(Biodata.this, MainActivity.class);
        moveToBeranda.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(moveToBeranda);
        finish();
    }

    public void Artikel(View view) {
        Intent moveToArtikel = new Intent(Biodata.this, Artikel.class);
        moveToArtikel.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(moveToArtikel);

    }
}