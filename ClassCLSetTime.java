package com.example.sun.taskassistant;

import android.app.TimePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

class ClassCLSetTime implements View.OnClickListener {
    private ActivityAddTask activityAddTask;
    private Button btn;

    public ClassCLSetTime(ActivityAddTask activityAddTask) {
        this.activityAddTask = activityAddTask;
    }

    @Override
    public void onClick(View view) {
        new TimePickerDialog(activityAddTask, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                String timeStart=String.format("%d-%d",hourOfDay,minute);
                btn.setText(timeStart);
            }
        },0,0,true).show();
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
