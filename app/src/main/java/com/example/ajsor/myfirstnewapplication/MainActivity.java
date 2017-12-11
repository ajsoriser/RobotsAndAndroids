package com.example.ajsor.myfirstnewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display();
    }

    public void Display(){
    //Define fields
        Button cmdEnter = findViewById(R.id.btnEnter);
        final EditText txtInput = findViewById(R.id.txtInput);
        final TextView lblDisplay = findViewById(R.id.lblDisplay);

        cmdEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Aaron;
                Aaron = "Hello, " + txtInput.getText().toString();
                lblDisplay.setText(Aaron);
            }
        });
    }
}

