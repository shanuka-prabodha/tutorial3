package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button b2,b3,b4,b5;
    TextView res;

    Float no1 ,no2,result ;
    String ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final String message1 = intent.getStringExtra("num1");
        final String message2 = intent.getStringExtra("num2");

        EditText edt1 = findViewById(R.id.ed3);
        EditText edt2 = findViewById(R.id.ed4);
        edt1.setText(message1);
        edt2.setText(message2);

        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        res=findViewById(R.id.textView5);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1= Float.parseFloat(message1);
                no2= Float.parseFloat(message2);

                result = no1+no2;

                ans = " 'no1' + 'no2' = 'result'" ;

                res.setText(String.valueOf(no1) + " + " +String.valueOf(no2) + "=" +  String.valueOf(result) );

            }
        });



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1= Float.parseFloat(message1);
                no2= Float.parseFloat(message2);

                result = no1-no2;

                ans = " 'no1' + 'no2' = 'result'" ;

                res.setText(String.valueOf(no1) + " - " +String.valueOf(no2) + "=" +  String.valueOf(result) );

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1= Float.parseFloat(message1);
                no2= Float.parseFloat(message2);

                result = no1*no2;

                ans = " 'no1' + 'no2' = 'result'" ;

                res.setText(String.valueOf(no1) + " X " +String.valueOf(no2) + "=" +  String.valueOf(result) );

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1= Float.parseFloat(message1);
                no2= Float.parseFloat(message2);

                result = no1/no2;

                ans = " 'no1' + 'no2' = 'result'" ;

                res.setText(String.valueOf(no1) + " / " +String.valueOf(no2) + "=" +  String.valueOf(result) );

            }
        });


    }



}