package com.example.bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbHinh1;
    private RadioButton rbHinh2;
    private RadioButton rbHinh3;
    private RadioButton rbHinh4;
    private RadioButton rbHinh5;

    private RadioButton hidden;
    private RadioButton show;
    private RadioButton big;
    private RadioButton small;
    private RadioButton defalt;

    int picture1 = R.drawable.clock;
    int picture2 = R.drawable.snow;
    int picture3 = R.drawable.cloud;
    int picture4 = R.drawable.mail;
    int picture5 = R.drawable.camera;
    private ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEnvent();
    }


    public void setControl(){
        rbHinh1 = (RadioButton) findViewById(R.id.rbtn_1);
        rbHinh2 = (RadioButton) findViewById(R.id.rbtn_2);
        rbHinh3 = (RadioButton) findViewById(R.id.rbtn_3);
        rbHinh4 = (RadioButton) findViewById(R.id.rbtn_4);
        rbHinh5 = (RadioButton) findViewById(R.id.rbtn_5);

        imgView = (ImageView) findViewById(R.id.img4);

        hidden = (RadioButton) findViewById(R.id.btn_1);
        show = (RadioButton) findViewById(R.id.btn_2);
        defalt = (RadioButton) findViewById(R.id.btn_5);
        big = (RadioButton) findViewById(R.id.btn_3);
        small = (RadioButton) findViewById(R.id.btn_4);

    }

    public void setEnvent() {
        rbHinh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(picture1);
            }
        });
        rbHinh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(picture2);
            }
        });
        rbHinh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(picture3);
            }
        });
        rbHinh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(picture4);
            }
        });
        rbHinh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setImageResource(picture5);
            }
        });

        hidden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setWillNotDraw(true);
            }

        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setWillNotDraw(false);
            }

        });

        big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setPadding(0,0, 0, 0);
            }

        });
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setPadding(100,100, 100, 100);
            }

        });
        defalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setPadding(60,60, 60, 60);
            }

        });
    }
}
