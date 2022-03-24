package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText no1,no2;
    private Button calculate;
    private TextView add,sub,mult,div;
    private double x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = (EditText) findViewById(R.id.no1);
        no2 = (EditText) findViewById(R.id.no2);
        calculate = (Button) findViewById(R.id.calculate);
        add = (TextView) findViewById(R.id.addR);
        sub = (TextView) findViewById(R.id.subR);
        mult = (TextView) findViewById(R.id.multR);
        div = (TextView) findViewById(R.id.divR);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(no1 == null || no2 == null){
                    Toast.makeText(getApplicationContext(), "please enter two numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                    calculateResults();
                }
            }
        });

    }

    private void getNumbers(){
        x = Double.parseDouble(no1.getText().toString());
        y = Double.parseDouble(no2.getText().toString());
    }

    private void calculateResults(){
        getNumbers();

        add.setText(Double.toString(x+y));
        sub.setText(Double.toString(x-y));
        mult.setText(Double.toString(x*y));
        div.setText(Double.toString(x/y));

    }
}