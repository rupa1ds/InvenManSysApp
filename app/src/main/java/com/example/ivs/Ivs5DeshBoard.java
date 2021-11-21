package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs5DeshBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs5deshboard);

        getSupportActionBar().hide();

        Button addp = findViewById(R.id.addp);
        addp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs5DeshBoard.this,Ivs7AddProduct.class);
                startActivity(rupa);
            }
        });
    }
}