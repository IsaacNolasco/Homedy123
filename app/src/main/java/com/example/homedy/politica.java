package com.example.homedy;

import static com.example.homedy.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class politica extends AppCompatActivity {
    Button aceptar;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.politica);
       aceptar=(Button)findViewById(id.Aceptar);
       aceptar.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               Intent i = new Intent(politica.this, pantalladeinicio.class);
               startActivity(i);
           }



       } );
   }
}
