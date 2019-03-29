package com.polotechnologies.homejoblink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button createAccountButton;
    Button signInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        createAccountButton = findViewById(R.id.buttonCreateAccount);
        signInButton = findViewById(R.id.buttonSignIn);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }

    /**
     * Method to Sign In The User With Phone Number
     * */
    private void signIn() {
    }

    /**
     * Method to Create Account for the user
     * */
    private void createAccount() {
        Intent openCreateAccountActivity = new Intent(LoginActivity.this, CreateAccountActivity.class);
        startActivity(openCreateAccountActivity);

    }
}
