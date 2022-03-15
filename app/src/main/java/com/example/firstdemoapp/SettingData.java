package com.example.firstdemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
public class SettingData extends Activity{
    EditText editTextAnish,editTextAnish2;
    Button btnCalculator;
    TextView textGender;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_data);
        editTextAnish = findViewById(R.id.editTextAnish);
        editTextAnish2 = findViewById(R.id.editTextAnish2);
        btnCalculator = findViewById(R.id.btnCalculator);
        textGender = findViewById(R.id.textGender);

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first = Integer.parseInt(editTextAnish.getText().toString());
                second = Integer.parseInt(editTextAnish2.getText().toString());
                result= first+second;
                textGender.setText("Result" + result);
            }
        });

    }

}
