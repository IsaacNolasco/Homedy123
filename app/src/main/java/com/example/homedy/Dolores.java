package com.example.homedy;

import static com.example.homedy.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class Dolores extends AppCompatActivity {
    Button doloredeEstomago;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.dolores_4);
        doloredeEstomago=(Button)findViewById(id.DOLORES);
        doloredeEstomago.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dolores.this,info_receta.class);
                startActivity(i);
            }



        } );

        }
    }

