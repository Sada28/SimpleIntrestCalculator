package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private EditText et1,et2,et3,et4;
    private Button btn1;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().isEmpty())
                 {
                    et1.setError("Only Numbers Allowed");
                    et1.requestFocus();
                    return;
                }
                else if (et2.getText().toString().isEmpty())
                {
                    et2.setError("Please Enter any Number");
                    et2.requestFocus();
                    return;
                }
                    else if(et3.getText().toString().isEmpty())
                    {
                        et3.setError("Please Enter any Number");
                        et3.requestFocus();
                        return;
                    }



                float p=Float.parseFloat(et1.getText().toString());
                float r=Float.parseFloat(et2.getText().toString());
                float t=Float.parseFloat(et3.getText().toString());
                float e=(p*r*t)/100;
                et4.setText("Total Simple Interest="+String.valueOf(e));


            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(null);
                et2.setText(null);
                et3.setText(null);
                et4.setText(null);

            }
        });
    }

}