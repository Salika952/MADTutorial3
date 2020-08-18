package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

Button btn1;
String EditString1;
String EditString2;
EditText editText1;
EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn1=(Button)findViewById(R.id.button);
        editText1=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                EditString1=editText1.getText().toString();
                intent.putExtra("value",EditString1);

                EditString2=editText2.getText().toString();
                intent.putExtra("value1",EditString2);

                startActivity(intent);

                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();




            }
        });


    }
}
