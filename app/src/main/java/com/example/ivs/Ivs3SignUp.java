package com.example.ivs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ivs3SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs3signup);

        Button sg=findViewById(R.id.signupbtn);
        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ivs3SignUp.this,Ivs5DeshBoard.class);
                startActivity(i);
            }
        });
    }
}