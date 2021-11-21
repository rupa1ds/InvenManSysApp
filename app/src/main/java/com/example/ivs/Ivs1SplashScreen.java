package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs1SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs1splashscreen);

        getSupportActionBar().hide();

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs1SplashScreen.this,Ivs2AccountPage.class);
                startActivity(rupa);
            }
        });
    }
}