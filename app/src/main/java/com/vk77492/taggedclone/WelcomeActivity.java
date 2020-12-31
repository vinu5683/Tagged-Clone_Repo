package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager mPager;
    private  int[] layouts={R.layout.slide1,R.layout.slide2,R.layout.slide3};
    private MpagerAdapter mpagerAdapter;
    private Button mBtnIntroNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_welcome);

        mPager = (ViewPager) findViewById(R.id.viewPagerIntro);
        mpagerAdapter=new MpagerAdapter(layouts,this);
        mPager.setAdapter(mpagerAdapter);
        mBtnIntroNext = findViewById(R.id.btnIntroNext);
        mBtnIntroNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login_Activity.class));
                finish();
            }
        });
    }
}