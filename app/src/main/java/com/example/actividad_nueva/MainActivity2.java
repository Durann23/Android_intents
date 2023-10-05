package com.example.actividad_nueva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.provider.Settings;
import android.net.Uri;
import android.content.Intent;
import android.provider.MediaStore;
import android.content.Intent;
import android.app.SearchManager;



public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private static final int GALLERY_REQUEST_CODE = 123;

    Button B;
    Button B2;
    Button B3;
    Button B4;
    Button B5;
    Button B6;
    Button B7;
    Button B8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        B=(Button) findViewById(R.id.intent1);
        B2 = findViewById(R.id.intent2);
        B3 = findViewById(R.id.intent3);
        B4 = findViewById(R.id.intent4);
        B5 = findViewById(R.id.impli1);
        B6 = findViewById(R.id.impli2);
        B7 = findViewById(R.id.impli3);
        B8 = findViewById(R.id.impli4);

        B.setOnClickListener(this);

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_SETTINGS);
                startActivity(intent);

            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8715012989"));
                startActivity(intent);


            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uttorreon.mx"));
                startActivity(intent);
            }
        });

        //INTROVERTIDOS

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Este es el contenido que deseas compartir.");
                startActivity(Intent.createChooser(intent, "Compartir con"));

            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, GALLERY_REQUEST_CODE);

            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse
                        ("geo:0,0?q=Universidad Tecnológica de Torreón"));
                startActivity(intent);

            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, "término de búsqueda");
                startActivity(intent);




            }
        });
    }

    @Override
    public void onClick(View view){

        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }


}