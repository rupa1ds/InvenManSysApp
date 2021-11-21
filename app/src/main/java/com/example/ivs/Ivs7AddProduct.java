package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs7AddProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs7addproduct);

        getSupportActionBar().hide();

        Button addbut = findViewById(R.id.addbut);
        addbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs7AddProduct.this,Ivs6AllProduct.class);
                startActivity(rupa);
            }
        });
    }
}