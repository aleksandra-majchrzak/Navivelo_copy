package com.example.tryhu.navivelo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        EditText login = (EditText) findViewById(R.id.login);
        EditText loginPassword = (EditText) findViewById(R.id.loginPassword);
        TextView registerLink = (TextView) findViewById(R.id.registerLink);

        loginPassword.setError("error");

        Button loginButton = (Button) findViewById(R.id.loginButton);


        //dodanie napisu "Zarejestruj się" jako aktywnego linku, który przekierwouje do okna logowania

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

                Toast.makeText(LoginActivity.this, R.string.app_name, Toast.LENGTH_SHORT).show();
                Snackbar.make(findViewById(R.id.login_relativeLayout), R.string.app_name, Snackbar.LENGTH_INDEFINITE).show();
            }


        });

        getString(R.string.app_name);
    }
}
