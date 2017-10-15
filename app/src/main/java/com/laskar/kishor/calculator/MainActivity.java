package com.laskar.kishor.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnADD,btnSUB,btnDIV,btnMUL;
    private TextView tvView;
    private EditText editText3,editText5;
    int num1,num2;
    float resultnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        ;
         btnADD=(Button) findViewById(R.id.btnADD);
        btnSUB=(Button) findViewById(R.id.btnSUB);
        btnDIV=(Button) findViewById(R.id.btnDIV);
        btnMUL=(Button) findViewById(R.id.btnMUL);
        tvView = (TextView) findViewById(R.id.tvView);
        editText3=(EditText)findViewById(R.id.editText3);
        editText5=(EditText)findViewById(R.id.editText5);

        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText3.getText().toString());
                num2= Integer.parseInt(editText5.getText().toString());

                resultnum=num1+num2;
                tvView.setText(String.valueOf(resultnum));
                Toast.makeText(MainActivity.this,tvView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        btnSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText3.getText().toString());
                num2= Integer.parseInt(editText5.getText().toString());

                resultnum=num1-num2;
                tvView.setText(String.valueOf(resultnum));
                Toast.makeText(MainActivity.this,tvView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        btnMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText3.getText().toString());
                num2= Integer.parseInt(editText5.getText().toString());

                resultnum=num1*num2;
                tvView.setText(String.valueOf(resultnum));
                Toast.makeText(MainActivity.this,tvView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        btnDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText3.getText().toString());
                num2= Integer.parseInt(editText5.getText().toString());

                resultnum=num1/num2;
                tvView.setText(String.valueOf(resultnum));
                Toast.makeText(MainActivity.this,tvView.getText(), Toast.LENGTH_SHORT).show();

            }
        });



    }
}
