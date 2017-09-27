package com.example.arturmusayelyan.activitylifecycleexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate invoked");
    }

    public void onClick(View view) {
        // finish();
       // Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        switch (view.getId()){
            case R.id.button:
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button_showTime:
                Intent intent1=new Intent("com.artur.showTime");
                startActivity(intent1);
                break;
            case R.id.button_ShowDate:
                Intent intent2=new Intent("com.artur.showDate");
                startActivity(intent2);
                break;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy invoked");
    }

}
