package com.example.lap2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai1 extends AppCompatActivity implements View.OnClickListener {
    public static final String SERVER_NAME = "http://192.168.100.18:80/kieuthanhtung_ph27526/student_GET.php";
    private EditText edName;
    private EditText edScore;
    private Button btnSend;
    private TextView tvResult;
    private Button btnBack;


    String strName,strScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = (EditText) findViewById(R.id.ed_name);
        edScore = (EditText) findViewById(R.id.ed_score);
        btnSend = (Button) findViewById(R.id.btn_send);
        btnBack = (Button) findViewById(R.id.btn_back);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnBack.setOnClickListener(this);
        btnSend.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_send){
            strName = edName.getText().toString();
            strScore = edScore.getText().toString();

            BackgroundTask_GET backgroundTask = new BackgroundTask_GET(tvResult,strName,strScore,Bai1.this);
            backgroundTask.execute();
            Log.d("Bai1", "Value of name: " + strName);
            Log.d("Bai1", "Value of score: " + strScore);

        }
    }
}