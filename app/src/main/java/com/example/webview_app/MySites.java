package com.example.webview_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MySites<S> extends AppCompatActivity {

    ImageButton btnFiap;
    ImageButton btnFacebook;
    ImageButton btnGitHub;
    ImageButton btnYoutube;

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


        //Setting images buttons
        btnFiap = (ImageButton) findViewById(R.id.btnFiap);
        btnFacebook = (ImageButton) findViewById(R.id.btnFacebook);
        btnGitHub = (ImageButton) findViewById(R.id.btnGithub);
        btnYoutube = (ImageButton) findViewById(R.id.btnYoutube);

        //Button functions
        btnFiap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MySites.this, "FIAP", Toast.LENGTH_SHORT).show();
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MySites.this, "FACEBOOK", Toast.LENGTH_SHORT).show();
            }
        });

        btnGitHub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MySites.this, "GITHUB", Toast.LENGTH_SHORT).show();
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MySites.this, "YOUTUBE", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
