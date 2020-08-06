package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button send;
    EditText t1,t2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        send = findViewById(R.id.button);
        t1 = findViewById(R.id.ed1);
        t2=findViewById(R.id.ed2);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent In = new Intent(FirstActivity.this,SecondActivity.class);

                String msg = t1.getText().toString();
                String msg2 = t2.getText().toString();

               In.putExtra("num1",msg);
               In.putExtra("num2",msg2);

                startActivity(In);

                Context context = getApplicationContext();
                CharSequence message = "Sending Message";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();


            }


        });



    }
}