package com.example.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "我是苏克阳", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "我是苏克阳", Toast.LENGTH_SHORT).show();
        //我是李武辉

        Log.i(TAG, "onCreate: 我是李武辉");
        //LWH   LWH
        //第二次提交
        ///依依不舍1
    }

    private static final String TAG = "MainActivity";
}