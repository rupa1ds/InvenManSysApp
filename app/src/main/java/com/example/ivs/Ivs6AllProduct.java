package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs6AllProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs6allproduct);

        getSupportActionBar().hide();

        Button addp2 = findViewById(R.id.addp2);
        Button delp2 = findViewById(R.id.delp2);
        addp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs6AllProduct.this, Ivs7AddProduct.class);
                startActivity(rupa);
            }
            });
        delp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs6AllProduct.this, Ivs8DeleteProduct.class);
                startActivity(rupa);
            }
        });

    }
}