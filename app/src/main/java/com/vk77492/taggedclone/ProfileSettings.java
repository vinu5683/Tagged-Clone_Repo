package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileSettings extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;

    Button mBtnPush,mBtnEmail,mBtnVIPSub,mBtnPassChange,mBtnCancelAccount;
    Button mBtnManageBouncers,mBtnBlockedUsers,mBtnContactUs,mBtnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);


        toolbar = (Toolbar) findViewById(R.id.toolbar_Profile_Setting);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listenersAndSetters();
    }

    public void listenersAndSetters(){
        mBtnPush = findViewById(R.id.btnPush);
        mBtnEmail = findViewById(R.id.btnEmail);
        mBtnVIPSub = findViewById(R.id.btnVIPSub);
        mBtnPassChange = findViewById(R.id.btnPassChange);
        mBtnCancelAccount = findViewById(R.id.btnCancelAccount);
        mBtnManageBouncers = findViewById(R.id.btnManageBouncers);
        mBtnBlockedUsers = findViewById(R.id.btnBlockedUsers);
        mBtnContactUs = findViewById(R.id.btnContactUs);
        mBtnLogout = findViewById(R.id.btnLogout);

        mBtnPush.setOnClickListener(this);
        mBtnEmail.setOnClickListener(this);
        mBtnVIPSub.setOnClickListener(this);
        mBtnPassChange.setOnClickListener(this);
        mBtnCancelAccount.setOnClickListener(this);
        mBtnManageBouncers.setOnClickListener(this);
        mBtnBlockedUsers.setOnClickListener(this);
        mBtnContactUs.setOnClickListener(this);
        mBtnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPush :
                startActivity(new Intent(getApplicationContext(),ProfileSettingsPush.class));
                break;
            case R.id.btnEmail :
                startActivity(new Intent(getApplicationContext(),ProfileSettingsPush.class));
                break;
            case R.id.btnVIPSub :
                startActivity(new Intent(getApplicationContext(),JoinVip.class));
                break;

        }
    }
}