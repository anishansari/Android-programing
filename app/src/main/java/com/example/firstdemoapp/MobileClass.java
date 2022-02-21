package com.example.firstdemoapp;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;


public class MobileClass extends Activity {
    public  int a=0;
    @Override
    public  void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.button_test);
        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
//        ClickTest();
    }

    public  void ClickTest(){
        Button button = (Button) findViewById(R.id.button_send);
        TextView txt = (TextView) findViewById(R.id.button_text_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a= a+1;
                Log.i("Button","I am Clicked");
//                txt.setText("Hello I am clicked");
                txt.setText(Integer.toString(a));
            }
        });

    }





}
