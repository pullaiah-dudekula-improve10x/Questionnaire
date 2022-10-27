package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class CorrectAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);

        Button verifyButton = findViewById(R.id.verify_btn);
        verifyButton.setOnClickListener(view -> {
            RadioButton radioButton1Btn = findViewById(R.id.radiobutton1_btn);
            if(radioButton1Btn.isChecked()) {
                Toast.makeText(this, " Answer is Wrong ", Toast.LENGTH_SHORT).show();
            }

            RadioButton radioButton2Btn = findViewById(R.id.radioButton2_btn);
            if(radioButton2Btn.isChecked()) {
                Toast.makeText(this, " Your Answer is Correct ", Toast.LENGTH_SHORT).show();
            }

            RadioButton radioButton3Btn = findViewById(R.id.radioButton3_btn);
            if(radioButton3Btn.isChecked()) {
                Toast.makeText(this, " your Answer is Wrong", Toast.LENGTH_SHORT).show();
            }

            RadioButton radioButton4Btn = findViewById(R.id.radioButton4_btn);
            if(radioButton4Btn.isChecked()) {
                Toast.makeText(this, " your answer is wrong", Toast.LENGTH_SHORT).show();
            }
        });

    }
}