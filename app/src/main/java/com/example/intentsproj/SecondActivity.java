package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String PassEdit;
    String PassEdit2;
    EditText SecondEditText1;
    EditText  SecondEditText2;
    Button Add;
    Button  Sub;
    Button Multi;
    Button Devi;
    TextView ResultTextView;


    Double Answer;
    Double number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        SecondEditText1=(EditText) findViewById(R.id.secondeditText);
        SecondEditText2=(EditText) findViewById(R.id.secondeditText2);

        Add=(Button) findViewById(R.id.add);
        Sub=(Button) findViewById(R.id.sub);
        Multi=(Button) findViewById(R.id.mult);
        Devi=(Button)findViewById(R.id.dev);
        ResultTextView=(TextView) findViewById(R.id.Result);



        Intent intent=getIntent();

        PassEdit=intent.getStringExtra("value");
        PassEdit2=intent.getStringExtra("value1");


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Double.parseDouble(PassEdit);
                number2=Double.parseDouble(PassEdit2);

                Answer=number1+number2;

                ResultTextView.setText(number1+" + "+number2+" = "+String.valueOf(Answer));
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Double.parseDouble(PassEdit);
                number2=Double.parseDouble(PassEdit2);

                Answer=number1-number2;

                ResultTextView.setText(number1+" - "+number2+" = "+String.valueOf(Answer));
            }
        });

        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Double.parseDouble(PassEdit);
                number2=Double.parseDouble(PassEdit2);

                Answer=number1*number2;

                ResultTextView.setText(number1+" * "+number2+" = "+String.valueOf(Answer));
            }
        });

        Devi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1=Double.parseDouble(PassEdit);
                number2=Double.parseDouble(PassEdit2);

                Answer=number1/number2;

                ResultTextView.setText(number1+" / "+number2+" = "+String.valueOf(Answer));
            }
        });





    }

      public void onResume() {
        super.onResume();
          SecondEditText1.setText(PassEdit);
          SecondEditText2.setText(PassEdit2);
      }


}
