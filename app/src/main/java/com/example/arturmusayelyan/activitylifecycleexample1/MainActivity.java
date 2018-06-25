package com.example.arturmusayelyan.activitylifecycleexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //First Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("PrintLog", "first activity: onCreate invoked");
        //finish();
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
                //intent by action
                String showTimeAction = "com.artur.showTime";
                Intent intent1=new Intent(showTimeAction);
                startActivity(intent1);
                break;
            case R.id.button_ShowDate:
                //intent by action
                String showDateAction = "com.artur.showDate";
                Intent intent2=new Intent(showDateAction);
                Intent chooserIntent=Intent.createChooser(intent2,"Choose date type");
                startActivity(chooserIntent);
                break;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("PrintLog", "first activity: onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("PrintLog", "first activity: onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("PrintLog", "first activity: onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("PrintLog", "first activity: onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //this method called when activity has been one time created and don't destroyed
        Log.d("PrintLog", "first activity: onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("PrintLog", "first activity: onDestroy invoked");
    }

}
