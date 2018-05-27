package com.example.fredsh2k.myapplication;

import java.util.Calendar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

public class CalendarActivity extends AppCompatActivity {

    private CompactCalendarView calendar;

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
    }
}
