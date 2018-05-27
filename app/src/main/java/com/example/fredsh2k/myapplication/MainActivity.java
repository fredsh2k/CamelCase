package com.example.fredsh2k.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.bravesong);
        ring.start();
    }

    public void goToCalendar(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void goToPart1(View view) {
        Intent intent = new Intent(this, Part1.class);
        startActivity(intent);
    }

    public void goToPart2(View view) {
        Intent intent = new Intent(this, activity_part2.class);
        startActivity(intent);
    }
}
