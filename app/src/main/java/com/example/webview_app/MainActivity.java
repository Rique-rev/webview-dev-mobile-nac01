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

        //check fields
        Boolean right_password = true ? user_password_int == 12345 : false;

        if(right_password){
            //push user to my sites page
            Intent intent = new Intent(this,MySites.class);
            intent.putExtra("username",user_name);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Senha correta: 12345", Toast.LENGTH_SHORT).show();
        }

    }

    public void Info(View view){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
