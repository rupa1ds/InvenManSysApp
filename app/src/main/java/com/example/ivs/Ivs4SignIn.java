package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs4SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs4signin);
        Button signin2 = findViewById(R.id.signin2);
        signin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs4SignIn.this,Ivs5DeshBoard.class);
                startActivity(rupa);
            }
        });
    }
}