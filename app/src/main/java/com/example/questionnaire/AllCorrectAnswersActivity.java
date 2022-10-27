package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class AllCorrectAnswersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_correct_answers);

        Button verify2Btn = findViewById(R.id.verify2_btn);
        verify2Btn.setOnClickListener(view -> {

            CheckBox mercuryBtn = findViewById(R.id.mercury_btn);
            CheckBox sunBtn = findViewById(R.id.sun_btn);
            CheckBox moonBtn = findViewById(R.id.moon_btn);
            CheckBox jupiterBtn = findViewById(R.id.jupiter_btn);
            CheckBox saturnBtn = findViewById(R.id.saturn_btn);
            CheckBox plutoBtn = findViewById(R.id.pluto_btn);
            if(mercuryBtn.isChecked() && jupiterBtn.isChecked() && saturnBtn.isChecked() && sunBtn.isChecked() == false && moonBtn.isChecked() == false && plutoBtn.isChecked() == false) {
                Toast.makeText(this, " Correct ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, " wrong ", Toast.LENGTH_SHORT).show();
            }

        });
    }
}