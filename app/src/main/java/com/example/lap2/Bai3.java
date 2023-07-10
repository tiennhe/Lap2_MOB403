package com.example.lap2;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai3 extends AppCompatActivity {
    public static final String SERVER_NAME2 = "http://192.168.169.100:3000/canh";
    Button button ;

    EditText edtcanh;
    String strcanh;
    TextView txtketqua;

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        button = findViewById(R.id.btngui);
        txtketqua = findViewById(R.id.txtketquabai3);
        edtcanh = findViewById(R.id.edtcanh);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strcanh = edtcanh.getText().toString();
                BackgroundTask_POST_bai3 backgroundTaskPostBai3 = new BackgroundTask_POST_bai3(Bai3.this , txtketqua);
                backgroundTaskPostBai3.execute(strcanh);
            }
        });



    }
}