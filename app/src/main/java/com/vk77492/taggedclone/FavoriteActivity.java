package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class FavoriteActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView imageView;
    private TextView t1,t2,t3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        imageView=findViewById(R.id.imageView);
        t1=findViewById(R.id.tvProfileName);
        t2=findViewById(R.id.tvProfileContacts);
        t3=findViewById(R.id.tvProfileDetails);

        t1.setText((String)getIntent().getStringExtra("line1"));
        t3.setText(getIntent().getStringExtra("line2"));
        long random = 9730000000L+(int)(new Random().nextFloat() * (9845123456F-9739999999F));
        t2.setText("+91 "+Long.toString(random));
        imageView.setImageURI(Uri.parse("android.resource://" + getPackageName()
                + "/drawable/" + getIntent().getStringExtra("pic")));

        toolbar = findViewById(R.id.toolbar_Profile_Setting_Push);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}