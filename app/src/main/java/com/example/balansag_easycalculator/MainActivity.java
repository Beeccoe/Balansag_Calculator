package com.example.balansag_easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends  AppCompatActivity implements View.OnClickListener {


    EditText txtVariable1, txtVariable2;
    Button btnSub, btnMul, btnDiv, btnMod, btnAdd;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVariable1 = findViewById(R.id.txtVariable1);
        txtVariable2 = findViewById(R.id.txtVariable2);

        btnAdd = findViewById(R.id.btnAdd);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);
        btnMul = findViewById(R.id.btnMul);
        btnSub = findViewById(R.id.btnSub);

        txtResult = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnSub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double variable1, variable2, answer;

        variable1 = Double.parseDouble(String.valueOf(txtVariable1.getText()));
        variable2 = Double.parseDouble(String.valueOf(txtVariable2.getText()));

        switch(v.getId()){
            case R.id.btnDiv:
                txtResult.setText(String.valueOf(divide(variable1, variable2)));
                break;

            case R.id.btnMod:
                txtResult.setText(String.valueOf(modulo(variable1, variable2)));
                break;

            case R.id.btnMul:
                txtResult.setText(String.valueOf(multiply(variable1, variable2)));
                break;

            case R.id.btnSub:
                answer = variable1 - variable2;
                txtResult.setText(String.valueOf(subtract(variable1, variable2)));
                break;

            case R.id.btnAdd:
                txtResult.setText(String.valueOf(add(variable1, variable2)));
                break;

        }
        //datatype name(parameter, if any){
            //code here
            //return parameter, if anydata
        }


    double add(double variable1, double variable2){
        return variable1 + variable2;
    }

    double subtract(double variable1, double variable2){
        return variable1 - variable2;
    }

    double divide(double variable1, double variable2){
        return variable1 / variable2;
    }

    double multiply(double variable1, double variable2){
        return variable1 * variable2;
    }

    double modulo(double variable1, double variable2){
        return variable1 % variable2;
    }
}