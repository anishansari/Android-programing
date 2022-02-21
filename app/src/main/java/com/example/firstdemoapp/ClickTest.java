package com.example.firstdemoapp;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class ClickTest  extends Activity{
    public int a= 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_demo);
        changeText();

    }

    public void changeText(){
        Button btn = (Button)findViewById(R.id.button_send);
        TextView txt = (TextView) findViewById(R.id.button_text_view);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+1;
                Log.i("Button","CLicked");
                txt.setText(Integer.toString(a));
            }
        });
    }
}
