package com.advancedsharedpfample.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.advancedsharedpfample.sharedpreference.R;

public class MainActivity extends Activity {


    EditText studentName, studentPlace, studentMobile;
    Button saveData, showData, totalData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Edit Texts and Buttons
        studentName=(EditText)findViewById(R.id.name);
        studentPlace=(EditText)findViewById(R.id.place);
        studentMobile=(EditText)findViewById(R.id.mob);

    }
}
