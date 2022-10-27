package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);

        Button radioBtn = findViewById(R.id.radiobuttons_btn);
        radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CorrectAnswerActivity.class);
            startActivity(intent);
        });
        Button checkBoxBtn = findViewById(R.id.checkboxes_btn);
        checkBoxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AllCorrectAnswersActivity.class);
            startActivity(intent);
        });
        Button calenderBtn = findViewById(R.id.calender_btn);
        calenderBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CalenderActivity.class);
            startActivity(intent);
        });
    }
}