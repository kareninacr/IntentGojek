package com.example.intentgojek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView btnFood, btnMart, btnRide, btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFood = (ImageView) findViewById(R.id.Btn_GoFood);
        btnFood.setOnClickListener(this);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Btn_GoFood:
                Intent gofood = new Intent( MainActivity.this, GoFoodActivity.class);
                startActivity(gofood);
                break;
        }
    }
}
