package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs2AccountPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs2accountpage);

        Button signin = findViewById(R.id.signin);
        Button signup = findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs2AccountPage.this,Ivs4SignIn.class);
                startActivity(rupa);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rupa = new Intent(Ivs2AccountPage.this,Ivs3SignUp.class);
                startActivity(rupa);
            }
        });

    }
}