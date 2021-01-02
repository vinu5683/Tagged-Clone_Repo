package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText etEmail;
    EditText etPass;
    EditText etConfirmPass;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etEmail = findViewById(R.id.etREmail);
        etPass = findViewById(R.id.etPassword);
        etConfirmPass = findViewById(R.id.etConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidate()){
                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                }
            }
        });

    }

    public boolean isValidate() {
        if (!(etEmail.getText().toString().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+") && etEmail.getText().length() > 0)) {
            etEmail.setError("Invalid Email");
            return false;
        }
        if (etPass.getText().toString().equals(etConfirmPass.getText().toString())) {
            if (etPass.getText().length() < 6) {
                etPass.setError("Password should be at least 6 characters");
                return false;
            }
        } else {
            etConfirmPass.setError("Password miss-match");
            return false;
        }


        return true;
    }
}