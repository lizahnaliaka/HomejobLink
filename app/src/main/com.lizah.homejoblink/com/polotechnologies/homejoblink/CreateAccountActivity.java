package com.polotechnologies.homejoblink;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccountActivity extends AppCompatActivity {

    TextInputEditText jobCategory;
    TextInputEditText jobTittle;
    TextInputEditText jobQualification;
    TextInputEditText jobDescription;
    Button createAccountButton;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        jobCategory = findViewById(R.id.jobCategory);
        jobTittle = findViewById(R.id.jobTittle);
        jobQualification = findViewById(R.id.jobQualification);
        jobDescription = findViewById(R.id.jobDescription);
        createAccountButton = findViewById(R.id.createAccountButton);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

    }

    /**
     * Method to Create Account for the user
     * */
    private void createAccount() {
    }
}
