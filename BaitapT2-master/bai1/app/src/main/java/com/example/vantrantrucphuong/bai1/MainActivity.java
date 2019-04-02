package com.example.vantrantrucphuong.bai1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtHoten, edtCMND, edtBoSung;
    RadioButton rdTrungCap, rdCaoDang, rdDaiHoc;
    CheckBox cbDocBao, cbDocSach, cbDocCoding;
    Button btnSendThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setControl() {
        edtHoten = (EditText) findViewById(R.id.edt_hoten);
        edtCMND = (EditText) findViewById(R.id.edt_cmnd);
        rdTrungCap = (RadioButton) findViewById(R.id.rb_trungcap);
        rdCaoDang = (RadioButton) findViewById(R.id.rb_caodang);
        rdDaiHoc = (RadioButton) findViewById(R.id.rb_daihoc);
        cbDocBao = (CheckBox) findViewById(R.id.cb_docbao);
        cbDocSach = (CheckBox) findViewById(R.id.cb_docsach);
        cbDocCoding = (CheckBox) findViewById(R.id.cb_doccoding);
        edtBoSung = (EditText) findViewById(R.id.edt_bosung);
        btnSendThongTin = (Button) findViewById(R.id.btn_sendthongtin);
    }

    private void setEvent(){
        btnSendThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "";
                String hoTen = String.valueOf(edtHoten.getText());
                String CMND = String.valueOf(edtCMND.getText());

                if(hoTen.length()< 3 || (CMND.length() < 9) && CMND.length() > 9){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đúng yêu cầu!!!", Toast.LENGTH_LONG).show();
                }
                else{
                    msg = hoTen + "\n"  +  CMND;
                    if(rdDaiHoc.isChecked()){
                        msg += "\n" + rdDaiHoc.getText();
                    }
                    else if (rdTrungCap.isChecked()){
                        msg += "\n" + rdTrungCap.getText();
                    }
                    else{
                        msg += "\n" + rdCaoDang.getText();
                    }

                    if(cbDocBao.isChecked()){
                        msg += "\n" + cbDocBao.getText();
                    }
                    if(cbDocCoding.isChecked()){
                        msg += "\n" + cbDocCoding.getText();
                    }
                    if(cbDocSach.isChecked()){
                        msg += "\n" + cbDocSach.getText();
                    }
                    if(edtBoSung.toString() != ""){
                        msg +="\n------------------\n" + "Thông tin bổ sung: \n" +edtBoSung.getText() + "\n------------------";
                }
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);  //Activity from den activity
                intent.putExtra("info", msg );  // Truyền một String
                startActivity(intent);}
            }
        });
    }



}
