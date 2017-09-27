package com.example.arturmusayelyan.activitylifecycleexample1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by artur.musayelyan on 27/09/2017.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity", "onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondActivity", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SecondActivity", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy invoked");
    }

    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
