package com.example.fredsh2k.myapplication;

import java.util.Calendar;
import java.util.Date;

import android.content.Context;
import android.graphics.Color;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import org.w3c.dom.Text;

public class CalendarActivity extends AppCompatActivity {

    private CompactCalendarView calendar;

    private boolean isGoodDate(Date date) {
        if (date.toString().contains("May 20")) return true;
        if (date.toString().contains("May 21")) return true;
        if (date.toString().contains("May 22")) return false;
        if (date.toString().contains("May 23")) return true;
        if (date.toString().contains("May 24")) return true;
        if (date.toString().contains("May 25")) return false;
        if (date.toString().contains("May 26")) return true;
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendar = findViewById(R.id.compactcalendar_view);
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);

        long[] times = { 1526806506000L , 1526892906000L, 1527065706000L, 1527152106000L, 1527324906000L};
        for (long time : times){
            Event ev1 = new Event(Color.GREEN, time);
            calendar.addEvent(ev1);
        }

        long[] bad_times = { 1526979306000L, 1527238506000L };
        for (long time : bad_times){
            Event ev1 = new Event(Color.RED, time);
            calendar.addEvent(ev1);
        }

        calendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();

                if (isGoodDate(dateClicked)) {
                    Toast.makeText(context, "You've been so brave today!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Didn't do mission today. Try again tomorrow", Toast.LENGTH_SHORT).show();
                }

                TextView mTextView1 = (TextView)findViewById(R.id.textView1);
                mTextView1.setText(((EditText)findViewById(R.id.input1)).getText().toString());
                mTextView1.setVisibility(View.VISIBLE);


            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {}
        });
    }
}
