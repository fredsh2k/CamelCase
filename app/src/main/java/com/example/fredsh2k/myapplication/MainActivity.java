package com.example.fredsh2k.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public static int points = 0;

    @Override
    protected void onResume() {
        ((TextView)findViewById(R.id.pointsTextView)).setText(Integer.toString(points));
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((TextView)findViewById(R.id.pointsTextView)).setText(Integer.toString(points));



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

    public void goToPart4(View view) {
        Intent intent = new Intent(this, ExamineFearActivity.class);
        startActivity(intent);
    }



    public static void addPoints(int extra) {
        points += extra;
    }


}
