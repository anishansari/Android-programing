package com.example.firstdemoapp;

import android.os.Bundle;
import android.app.Activity;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import com.example.firstdemoapp.R;


public class ButtonClickTest  extends  Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_test);
    }
}
