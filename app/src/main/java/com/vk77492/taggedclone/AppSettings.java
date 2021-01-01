package com.vk77492.taggedclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class AppSettings extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private SeekBar mAgeSeekBar;
    private SeekBar mDistance;
    private RadioGroup mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_settings);


        mGender=findViewById(R.id.radioGroup);
        mGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rMale=findViewById(R.id.rbMale);
                if(rMale.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Your interested in Male", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Your interested in Female", Toast.LENGTH_SHORT).show();
                }
            }
        });

        toolbar = findViewById(R.id.toolbar_App_Setting);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mAgeSeekBar = findViewById(R.id.seekBar);
        mDistance=findViewById(R.id.sbDistance);
        mDistance.setProgress(21);
        mAgeSeekBar.setProgress(21);
        seekBarChange();

    }

    public void seekBarChange(){
        mAgeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"Showing "+progress+"+ aged peoples", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        mDistance.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"Distance set to "+progress+"Km", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}