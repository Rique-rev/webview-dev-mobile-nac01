package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getUserInfo(View view){

        //get username
        EditText message = findViewById(R.id.txtUsuario);
        String user_name = message.getText().toString();

        //get password
        EditText password = findViewById(R.id.pswLogin);
        String user_password_str = password.getText().toString();
        Integer user_password_int = Integer.valueOf(user_password_str);


        //push user to my sites page
        Boolean right_username = true ? user_name.equals("nac01") : false;
        Boolean right_password = true ? user_password_int == 12345 : false;

        if(right_username && right_password){
            Intent intent = new Intent(this,MySites.class);
            intent.putExtra("username",user_name);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuário e/ou senha errado(s)!", Toast.LENGTH_SHORT).show();
        }

    }
}
