package com.geektech.java3hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car = findViewById(R.id.img_car);

        Glide
        .with(this)
        .load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg")
        .into(car);
    }
}