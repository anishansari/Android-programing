package com.example.firstdemoapp;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.firstdemoapp.R;
public class communicate extends Activity{

    EditText edtId,edtName;
    RadioButton radMale,radFemale;
    Spinner spProgram;
    Button btnSubmit;
    TextView txtResult;



    @Override
    protected  void  onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.communicate);

        edtId=findViewById(R.id.edtID);
        edtName=findViewById(R.id.edtName);
        radMale=findViewById(R.id.radMale);
        radFemale=findViewById(R.id.radFemale);
        spProgram=findViewById(R.id.spProgram);
        btnSubmit=findViewById(R.id.btnSubmit);
        txtResult=findViewById(R.id.txtResult);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){

                String id=edtId.getText().toString();
                String name=edtName.getText().toString();

                String gender="";
                if(radMale.isChecked())
                    gender="Male";
                else
                    gender="Female";

                String program=spProgram.getSelectedItem().toString();

                txtResult.setText("Student Id="+id+"\n"+"Student Name="
                        +name+"\n"+"Gender="+gender+"\n"+"Program="+program);
            }
        });
    }




}
