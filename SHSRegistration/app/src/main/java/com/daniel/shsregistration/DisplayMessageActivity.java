package com.daniel.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {


    TextView AcademicProgram, FullName, Gender, checkbox;

    String academicProgram, gender, requirements, full_name;
    String  last, first, middle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        AcademicProgram = findViewById(R.id.tvAcademicProgram);
        FullName = findViewById(R.id.tvFullName);
        Gender = findViewById(R.id.tvGender);
        checkbox = findViewById(R.id.tvRequirements);



        Intent intent = getIntent();
        academicProgram = intent.getStringExtra("academicProgram");
        last = intent.getStringExtra("input1");
        first = intent.getStringExtra("input2");
        middle = intent.getStringExtra("input3");
        gender = intent.getStringExtra("gender");
        requirements = intent.getStringExtra("checkbox");



        AcademicProgram.setText(academicProgram);
        FullName.setText(full_name);
        Gender.setText(gender);
        checkbox.setText(requirements);

        full_name = first + " " + middle + " " + last;
    }
}
