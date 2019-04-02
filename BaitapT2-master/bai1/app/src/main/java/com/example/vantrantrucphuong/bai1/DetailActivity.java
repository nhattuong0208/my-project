package com.example.vantrantrucphuong.bai1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setControl();
        Intent intent = getIntent();
        String info = intent.getStringExtra("info");
        txt.setText(info);
    }

    private void setControl(){
        txt = (TextView) findViewById(R.id.txt);
    }

}
