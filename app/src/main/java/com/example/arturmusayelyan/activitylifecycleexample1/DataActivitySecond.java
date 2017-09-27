package com.example.arturmusayelyan.activitylifecycleexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DataActivitySecond extends AppCompatActivity {
    private TextView dataTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_second);
        dataTextView2=(TextView) findViewById(R.id.textView_date2);
        SimpleDateFormat dateFormat=new SimpleDateFormat("EEE,MMM d,yyyy");
        String date=dateFormat.format(new Date(System.currentTimeMillis()));
        dataTextView2.setText(date);
    }
}
