package com.classthree.loginsystembasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userName, password;
    private Button loginButton;
    String takeUsername, takePassword;
    String myUserName = "aabbcc";
    String myPassword = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.name);
        password = findViewById(R.id.password);
        loginButton =  findViewById(R.id.loginb);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeUsername = userName.getText().toString();
                takePassword = password.getText().toString();
               if(takePassword.equals(myPassword) && takeUsername.equals(myUserName)){
                   Toast.makeText(getApplicationContext(), "Login done", Toast.LENGTH_LONG).show();
               }
               else {
                   if(myUserName.equals(takeUsername)){
                   }
                   else {
                       Toast.makeText(getApplicationContext(), "Wrong user name", Toast.LENGTH_LONG).show();

                   }
                   if(myPassword.equals(takePassword)){

                   }
                   else {
                       Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_LONG).show();
                   }
               }
            }
        });
    }
}
