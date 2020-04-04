package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MySites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sites);


        //receive intent from activityMain and get username
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        //set welcome message
        String welcome_msg = "Seja bem vindo " + username + "!";

        //showing welcome message
        TextView lbWelcome = findViewById(R.id.txtWelcomeMsg);
        lbWelcome.setText(welcome_msg);
    }
}
