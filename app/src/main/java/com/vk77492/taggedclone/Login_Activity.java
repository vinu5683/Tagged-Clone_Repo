package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {
    EditText etEmail;
    EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button mBtnLogin = findViewById(R.id.btnLogin);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPassword);

        Button mBtnSkip = findViewById(R.id.btnSkip);
        mBtnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                Login_Activity.this.finish();
            }
        });
        TextView mTvNewUser = findViewById(R.id.tvRegister);
        mTvNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
        TextView tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidate())
                {
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    Login_Activity.this.finish();
                }
            }
        });
    }

    public boolean isValidate() {
        if (!(etEmail.getText().toString().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+") && etEmail.getText().length() > 0)) {
            etEmail.setError("Invalid Email");
            return false;
        }
        if (etPass.getText().length() < 6) {
            etPass.setError("Password should be at least 6 characters");
            return false;
        }
        return true;
    }
}