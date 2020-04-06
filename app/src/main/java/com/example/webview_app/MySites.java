package com.example.webview_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
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

        //Setting images buttons
        btnFiap = (ImageButton) findViewById(R.id.btnFiap);
        btnFacebook = (ImageButton) findViewById(R.id.btnFacebook);
        btnGitHub = (ImageButton) findViewById(R.id.btnGithub);
        btnYoutube = (ImageButton) findViewById(R.id.btnYoutube);

        //receive intent from activityMain and get username
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        //set welcome message
        String welcome_msg = "Seja bem vindo " + username + "!";

        //showing welcome message
        TextView lbWelcome = findViewById(R.id.txtWelcomeMsg);
        lbWelcome.setText(welcome_msg);

    }

    public void FiapSite(View view){
        String url = "https://www.fiap.com.br/";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    public void FacebookSite(View view){
        String url = "https://pt-br.facebook.com/";


        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }
    public void GithubSite(View view){
        String url = "https://github.com/";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    public void YoutubeSite(View view){
        String url = "https://www.youtube.com/";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    public void MercadoLivreSite(View view){
        String url = "https://www.mercadolivre.com.br/";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    public void BuscapeSite(View view){
        String url = "https://www.buscape.com.br/";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    public void MagaluSite(View view){
        String url = "https://www.magazineluiza.com.br/?partner_id=24701&gclid=CjwKCAjwpqv0BRABEiwA-TySwVe0V3cvYSbCBlBH6mGVkAXRzOPDaiAsrZlE_A7Y2kC2Wn0O2g3jyxoCm8gQAvD_BwE";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

    public void EbaySite(View view){
        String url = "https://br.ebay.com/";
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }
}
