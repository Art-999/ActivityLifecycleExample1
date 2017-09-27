package com.example.arturmusayelyan.activitylifecycleexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity extends AppCompatActivity {
    private TextView dataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        dataTextView=(TextView)findViewById(R.id.textView_date);
        SimpleDateFormat dataFormat=new SimpleDateFormat("dd.MM.yyyy");
        String date=dataFormat.format(new java.sql.Date(System.currentTimeMillis()));

        dataTextView.setText(date);
    }
}
