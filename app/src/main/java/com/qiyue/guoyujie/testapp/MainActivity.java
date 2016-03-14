package com.qiyue.guoyujie.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试GitHub提交代码！
        TextView textView = (TextView) findViewById(R.id.first);
        TextView textViewSecond = (TextView) findViewById(R.id.second);

        //this is a apple !
        //yes or not ?
    }
}
