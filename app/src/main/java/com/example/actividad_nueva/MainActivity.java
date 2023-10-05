package com.example.actividad_nueva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button B;
    TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=findViewById(R.id.contador);
        B=(Button) findViewById(R.id.btn1);
        B.setOnClickListener(this);
        Intent i=new Intent(this, MainActivity2.class);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                contador.setText(""+millisUntilFinished/1000);
            }
            public void onFinish() {

                startActivity(i);
            }
        }.start();
    }

    @Override
    public void onClick(View view){
        Intent i=new Intent(this, MainActivity2.class);

        startActivity(i);
    }
}