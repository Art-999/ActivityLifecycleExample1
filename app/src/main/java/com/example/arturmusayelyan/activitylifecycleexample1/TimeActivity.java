package com.example.arturmusayelyan.activitylifecycleexample1;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TimeActivity extends AppCompatActivity {
    private TextView timeShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        timeShow=(TextView)findViewById(R.id.timeShowTextView);
        SimpleDateFormat data=new SimpleDateFormat("HH:mm:ss");
        String time=data.format(new Date(System.currentTimeMillis()));
        timeShow.setText(time);
    }
}
