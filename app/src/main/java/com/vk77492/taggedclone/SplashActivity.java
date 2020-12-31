package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_LENGTH = 4000;
    private ImageView mIv1, mIv2;
    private Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        // starting activity login after 4 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashActivity.this, WelcomeActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_LENGTH);

        mIv1 = findViewById(R.id.logo1);
        mIv2 = findViewById(R.id.logo2);

        //adding animations for buttons
        top = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mainlogoanimation);
        bottom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sublogoanimation);
        mIv1.setAnimation(top);
        mIv2.setAnimation(bottom);
    }
}