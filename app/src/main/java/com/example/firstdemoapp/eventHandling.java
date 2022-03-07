package com.example.firstdemoapp;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class eventHandling extends Activity {
    public int a = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventhandling);
        ClickTest();
        longClickTest();
        focusChangeTest();
        touchTest();
        onKeyTest();

    }
//onstart
@Override
protected  void onStart()
{
    super.onStart();
    Log.d("Lifecycle Test","Activity Started");
}

//onResume
    @Override
    protected  void onResume()
    {
        super.onResume();
        Log.d("Lifecycle Test","Activity Resumed");
    }

    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Log.d("Lifecycle Test","Activity Restarted");
    }

    @Override
    protected  void onPause()
    {
        super.onPause();
        Log.d("Lifecycle Test","Activity Paused");
    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Log.d("Lifecycle Test","Activity Stopped");
    }

    @Override
    protected  void onDestroy()
    {
        super.onDestroy();
        Log.i("Lifecycle Test","Activity Destroyed");
    }














    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.menu_main,menu);
       return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                //Write your code
                return true;
            case R.id.Bikash:
                //Write your code
                return true;
            case R.id.Chandan:
                //Write your code
                return true;
            case R.id.Sadam:
                //Write your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void ClickTest() {
        Button button = (Button) findViewById(R.id.eventButton1);
        TextView txt = (TextView) findViewById(R.id.editTextTextEmailAddress);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 1;
                Log.i("Button", "I am Clicked");
//                txt.setText("Hello I am clicked");
                txt.setText(Integer.toString(a));
//                longclick();
            }
        });
    }

    public void longClickTest() {
        Button button = (Button) findViewById(R.id.eventButton2);
        TextView txt = (TextView) findViewById(R.id.editTextTextEmailAddress);

//        txt.setOnLongClickListener(new View.OnLongClickListener() {
//            public boolean onLongClick(View v) {
//                longclick();
//                return true;
//            }
//        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Your Text", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void focusChangeTest() {
        EditText edit_txt = (EditText) findViewById(R.id.editTextTextEmailAddress);
        edit_txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Toast.makeText(getApplicationContext(), "Why did you do that? That REALLY hurts!!!", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void onKeyTest() {
        EditText edit_txt = (EditText) findViewById(R.id.editTextTextEmailAddress);
        edit_txt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                Toast.makeText(getApplicationContext(), "This is OnKeyTest", Toast.LENGTH_LONG).show();
                return true;
            }
        });

    }

    public void touchTest() {
        TextView edit_txt = (TextView) findViewById(R.id.eventEmail);
        edit_txt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(getApplicationContext(), "You've touched the textView", Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }




}


