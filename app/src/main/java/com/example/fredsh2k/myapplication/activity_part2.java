package com.example.fredsh2k.myapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class activity_part2 extends AppCompatActivity {

    public String journal1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
    }

    public void congratulations(View view){
        Toast myToast = Toast.makeText(this, "Success isn't about the end result, " +
                "it's about what you learn along the way! " +
                "well done!!", Toast.LENGTH_SHORT);
        myToast.show();
        journal1 = ((TextInputLayout)findViewById(R.id.input1)).getEditText().getText().toString();
        CalendarActivity.setText(journal1);
    }

    public void goReadMe(View view){
        Intent read = new Intent(this,part2reading.class);
        startActivity(read);
    }
}
