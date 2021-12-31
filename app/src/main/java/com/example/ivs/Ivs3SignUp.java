package com.example.ivs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Ivs3SignUp extends AppCompatActivity {
    private Button Button;
    private EditText InputName,InputEmail,InputPassword;
    private ProgressDialog loadingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivs3signup);

        Button sg=(Button)findViewById(R.id.signupbtn);
        InputName = (EditText) findViewById(R.id.nameet) ;
        InputEmail = (EditText) findViewById(R.id.emailedt) ;
        InputPassword = (EditText) findViewById(R.id.passwordedt) ;
        loadingBar = new ProgressDialog(this);

        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ivs3SignUp.this,Ivs5DeshBoard.class);
                startActivity(i);
                Button();
            }
        });
    }

    private void Button()
    {
        String name = InputName.getText().toString();
        String email = InputName.getText().toString();
        String password = InputName.getText().toString();
        
        if (TextUtils.isEmpty(name)){
            Toast.makeText(this, "PLease write your name...", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "PLease write your email...", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "PLease write your password...", Toast.LENGTH_SHORT).show();
        }
        else{
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please wait, while we are cheaking the credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            validateemail(name,email,password);
        }
    }

    private void validateemail(String name, String email, String password) {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                if (!(datasnapshot.child("users").child("email").exists()))
                {
                    HashMap<String, Object> userdataMap = new HashMap<>();
                    userdataMap.put("email",email);
                    userdataMap.put("password",password);
                    userdataMap.put("name",name);

                    RootRef.child("Users").child(email).updateChildren(userdataMap)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task)
                                {
                                    if(task.isSuccessful())
                                    {
                                        Toast.makeText(Ivs3SignUp.this, "Congratulations, your account has been created.", Toast.LENGTH_SHORT).show();
                                        loadingBar.dismiss();

                                        Intent i = new Intent(Ivs3SignUp.this,Ivs5DeshBoard.class);
                                        startActivity(i);
                                    }
                                    else
                                    {
                                        loadingBar.dismiss();
                                        Toast.makeText(Ivs3SignUp.this, "Network Error:Please Try Agan", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
                else
                {
                    Toast.makeText(Ivs3SignUp.this, "This" + email +"already exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                    Toast.makeText(Ivs3SignUp.this, "Please try again using another email", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(Ivs3SignUp.this,Ivs5DeshBoard.class);
                    startActivity(i);


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}









