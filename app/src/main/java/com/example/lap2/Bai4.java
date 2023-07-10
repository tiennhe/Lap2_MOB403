package com.example.lap2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4 extends AppCompatActivity {
    public static final String SERVER_NAME3= "http://192.168.169.100:3000/phuongtrinh";

    EditText  editTextA , editTextB , editTextC;
    Button buttonsend ;
    TextView textViewketqua;
    String strA , strB , strC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        editTextA = findViewById(R.id.edtcanha);
        editTextB = findViewById(R.id.edtcanhb);
        editTextC = findViewById(R.id.edtcanhc);
        buttonsend = findViewById(R.id.btnsendbai4);
        textViewketqua = findViewById(R.id.txtketquabai4);
        buttonsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strA = editTextA.getText().toString();
                strB = editTextB.getText().toString();
                strC = editTextC.getText().toString();
                BackgroundTask_POST_bai4 backgroundTask_post_bai4 = new BackgroundTask_POST_bai4(Bai4.this , textViewketqua );
                backgroundTask_post_bai4.execute(strA , strB , strC);

            }
        });
    }
}