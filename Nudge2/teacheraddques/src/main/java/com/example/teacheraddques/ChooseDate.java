package com.example.teacheraddques;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class ChooseDate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_date);
        int year, month, day;
        DatePicker datePicker = (DatePicker) findViewById(R.id.date);
        Calendar date = Calendar.getInstance();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                Toast.makeText(ChooseDate.this, "Your choose date is: "+day+"/"+(month+1)+"/"+year, Toast.LENGTH_SHORT).show();
                
            }
        });

        Button addDate = (Button) findViewById(R.id.release);
        addDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChooseDate.this, "Release successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }


}