package com.example.vantrantrucphuong.bai4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    CheckBox cbBG, cbColor, cbCenter;
    RadioButton rbOdd, rbEven, rbBoth;
    TextView txtKQ;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setControl(){
        cbBG = (CheckBox) findViewById(R.id.cb_bg);
        cbColor = (CheckBox) findViewById(R.id.cb_color);
        cbCenter = (CheckBox) findViewById(R.id.cb_center);
        rbOdd = (RadioButton) findViewById(R.id.rb_odd);
        rbEven = (RadioButton) findViewById(R.id.rb_even);
        rbBoth = (RadioButton) findViewById(R.id.rb_both);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        txtKQ = (TextView) findViewById(R.id.txt_result);
    }

    private void setEvent(){
//        Random rd=new Random();
//        x=rd.nextInt((Max-Min+1)+Min);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Random rd=new Random();
                int x=rd.nextInt(101);
                int y=rd.nextInt(101);
                if(checkedId == R.id.rb_even){
//                    Toast.makeText(MainActivity.this, "even", Toast.LENGTH_SHORT).show();
                    while(x%2 != 0){
                        x=rd.nextInt(101);
                    }
                    txtKQ.setText(String.valueOf(x));
                }
                else if(checkedId == R.id.rb_odd){
//                    Toast.makeText(MainActivity.this, "odd", Toast.LENGTH_SHORT).show();
                    while(x%2 == 0){
                        x=rd.nextInt(101);
                    }
                    txtKQ.setText(String.valueOf(x));
                }
                else{
//                    Toast.makeText(MainActivity.this, "both", Toast.LENGTH_SHORT).show();
                    while(x%2 == 0){
                        x=rd.nextInt(101);
                    }
                    while(y%2 != 0){
                        y=rd.nextInt(101);
                    }
                    txtKQ.setText(String.valueOf(y) + " - " + String.valueOf(x));
                }
            }
        });


        cbBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbBG.isChecked()){
                    txtKQ.setBackgroundColor(Color.parseColor("#FFFF33"));
//                    Toast.makeText(MainActivity.this, "BG", Toast.LENGTH_SHORT).show();
                }
                else {
                    txtKQ.setBackgroundColor(Color.parseColor("#eeeeee"));
                }
            }
        });
        cbColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbColor.isChecked()){
                    txtKQ.setTextColor(Color.parseColor("#FF0000"));
//                    Toast.makeText(MainActivity.this, "BG", Toast.LENGTH_SHORT).show();
                }
                else {
                    txtKQ.setTextColor(Color.parseColor("#999999"));
                }
            }
        });
        cbCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbCenter.isChecked()){
                    txtKQ.setGravity(Gravity.CENTER);
//                    txtKQ.setGravity();
//                    Toast.makeText(MainActivity.this, "BG", Toast.LENGTH_SHORT).show();
                }
                else{
                    txtKQ.setGravity(Gravity.LEFT);
                }
            }
        });
    }
}
