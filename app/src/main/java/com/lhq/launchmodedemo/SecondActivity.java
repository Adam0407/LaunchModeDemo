package com.lhq.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG,"onCreate");
    }

    public void goTo1Activity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void goTo3Activity(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

    public void goTo2Activity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG,"onNewIntent");
        setIntent(intent);
    }


}
