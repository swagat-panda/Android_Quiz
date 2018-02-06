package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1=(TextView)findViewById(R.id.textView5);
        Intent intent=getIntent();
        String s=intent.getStringExtra("count");
        t1.setText(s+"/10");
    }
}
