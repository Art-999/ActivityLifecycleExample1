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
    //Second Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("PrintLog", "second activity: onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("PrintLog", "second activity: onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("PrintLog", "second activity: onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("PrintLog", "second activity: onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("PrintLog", "second activity: onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("PrintLog", "second activity: onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("PrintLog", "second activity: onDestroy invoked");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //back-i depqum activity-n destroy-e linum,isk iren naxordox activitin ete mnacel e stack-um apa kancvum e onRestart ayl voch te onCreate
    }

    public void onClick(View view) {
        //ays kerp destroy chi linum, mnum e stack-um,isk hajord activityn noric e stexcvum` onCreate-e kanchvum e noric
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
