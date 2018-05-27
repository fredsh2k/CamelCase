package com.example.fredsh2k.myapplication;

import android.content.Intent;
import android.media.AudioManager;
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
    }

    public void goToCalendar(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void goToPart1(View view) throws IOException {
        Intent intent = new Intent(this, Part1.class);
        startActivity(intent);

//        String url = "https://www.youtube.com/watch?v=QUQsqBqxoR4"; // your URL here
//        MediaPlayer mediaPlayer = new MediaPlayer();
//        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//        mediaPlayer.setDataSource(url);
//        mediaPlayer.prepare(); // might take long! (for buffering, etc)
//        mediaPlayer.start();
    }
}
