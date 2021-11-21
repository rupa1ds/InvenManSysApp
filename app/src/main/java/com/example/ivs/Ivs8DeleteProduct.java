package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs8DeleteProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs8deleteproduct);

        getSupportActionBar().hide();

        Button deleteitem = findViewById(R.id.deleteitem);
        deleteitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs8DeleteProduct.this,Ivs6AllProduct.class);
                startActivity(rupa);
            }
        });
    }
}