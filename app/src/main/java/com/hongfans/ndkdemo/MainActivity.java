package com.hongfans.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        JNIHelper helper = new JNIHelper();
        tv.setText(helper.stringFromJNI());

        String str = JNIHelper.getString();
        Toast.makeText(MainActivity.this, "" + str, Toast.LENGTH_SHORT).show();
    }
}
