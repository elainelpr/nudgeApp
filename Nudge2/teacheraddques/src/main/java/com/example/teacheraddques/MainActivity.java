package com.example.teacheraddques;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button chooseDate = (Button) findViewById(R.id.chooseDate);
        chooseDate.setOnClickListener(new MyOnClickListener());
        Button chooseTime = (Button) findViewById(R.id.chooseTime);
        chooseTime.setOnClickListener(new MyOnClickListener());

    }

    class MyOnClickListener implements View.OnClickListener {
        //按钮点击
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.chooseTime) {//被点击的是确认按钮
                //弹窗
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                String time = String.format("%02d:%02d", hourOfDay, minute);
                                Button editText = findViewById(R.id.chooseTime);
                                editText.setText(time);
                            }
                        }, 0, 0, true);
                timePickerDialog.show();
            } else if (view.getId() == R.id.chooseDate) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                        String day = String.format("%d/%02d/%02d", year, month, date);
                        Button editDate = findViewById(R.id.chooseDate);
                        editDate.setText(day);
                    }
                }, 2022, 7, 22);
                datePickerDialog.show();
            }
        }
    }
}







//        Button chooseDate = (Button) findViewById(R.id.date);
//        chooseDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent addDate = new Intent(MainActivity.this, ChooseDate.class);
//                startActivity(addDate);
//            }
//        });
//    }
//}