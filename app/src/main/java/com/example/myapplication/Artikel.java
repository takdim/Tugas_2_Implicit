package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Artikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
    }

    public void Beranda(View view) {
        Intent moveToBeranda = new Intent(Artikel.this, MainActivity.class);
        moveToBeranda.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(moveToBeranda);
        finish();
    }

    public void Biodata(View view) {
        Intent moveToBiodata = new Intent(Artikel.this, Biodata.class);
        moveToBiodata.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(moveToBiodata);

    }
}