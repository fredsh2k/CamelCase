package com.example.fredsh2k.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        RadioGroup checkbox_age = findViewById(R.id.checkbox_age);
//        checkbox_age.
    }

    public void goToMain(View view) {
        Intent intent = new Intent(this, MainNavActivity.class);
        startActivity(intent);
    }
}
