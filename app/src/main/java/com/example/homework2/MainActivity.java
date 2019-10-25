package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
            btn_0, btn_Add, btn_Sub, btn_Mult, btn_Div, btn_Equal, btn_Dot,
            btn_Clear;
    EditText mainEdit;
    float v1, v2, result;
    boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mult = (Button) findViewById(R.id.btn_Mult);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Equal = (Button) findViewById(R.id.btn_Equal);
        btn_Dot = (Button) findViewById(R.id.btn_Dot);
        btn_Clear = (Button) findViewById(R.id.btn_Clear);
        mainEdit = (EditText) findViewById(R.id.mainEdit);


        btn_0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mainEdit.setText(mainEdit.getText() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mainEdit.setText(mainEdit.getText()+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mainEdit.setText(mainEdit.getText()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+"9");
            }
        });
        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainEdit.setText(mainEdit.getText()+".");
            }
        });
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainEdit.getText().toString().equals(".")) {
                    mainEdit.setText("Error: Invalid input!");
                } else {
                    v1 = Float.parseFloat(mainEdit.getText().toString());
                    mainEdit.setText("");
                    add = true;
                }
            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainEdit.getText().toString().equals(".")){
                    mainEdit.setText("Error: Invalid input!");
                }
                else {
                    v1 = Float.parseFloat(mainEdit.getText().toString());
                    mainEdit.setText("");
                    sub = true;
                }
            }
        });
        btn_Mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mainEdit.getText().toString().equals(".")){
                    mainEdit.setText("Error: Invalid input!");
                }
                else {
                    v1 = Float.parseFloat(mainEdit.getText().toString());
                    mainEdit.setText("");
                    mult = true;
                }
            }
        });
        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainEdit.getText().toString().equals(".")){
                    mainEdit.setText("Error: Invalid input!");
                }
                else {
                    v1 = Float.parseFloat(mainEdit.getText().toString());
                    mainEdit.setText("");
                    div = true;
                }
            }
        });
        btn_Clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mainEdit.setText("");
            }
        });
        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add == false && sub == false && mult == false && div == false){
                    mainEdit.setText("0.0");
                }
                else if(add == true){
                    if(mainEdit.getText().toString().equals(".")){
                        mainEdit.setText("Error: Invalid input!");
                    }
                    else {
                        v2 = Float.parseFloat(mainEdit.getText().toString());
                        mainEdit.setText("");
                        result = v1 + v2;
                        mainEdit.setText(Float.toString(result));
                        add = false;
                    }

                }
                else if(sub == true){
                    if(mainEdit.getText().toString().equals(".")){
                        mainEdit.setText("Error: Invlaid input!");
                    }
                    else {
                        v2 = Float.parseFloat(mainEdit.getText().toString());
                        mainEdit.setText("");
                        result = v1 - v2;
                        mainEdit.setText(Float.toString(result));
                        sub = false;
                    }
                }
                else if(mult == true){
                    if(mainEdit.getText().toString().equals(".")){
                        mainEdit.setText("Error: Invalid input!");
                    }
                    else {
                        v2 = Float.parseFloat(mainEdit.getText().toString());
                        mainEdit.setText("");
                        result = v1 * v2;
                        mainEdit.setText(Float.toString(result));
                        mult = false;
                    }
                }
                else if(div == true){
                    if(mainEdit.getText().toString().equals(".")){
                        mainEdit.setText("Error: Invlaid input!");
                    }
                    else {
                        v2 = Float.parseFloat(mainEdit.getText().toString());
                        mainEdit.setText("");
                        if (v2 == 0.0) {
                            mainEdit.setText("Error: Div by 0");
                            div = false;
                        } else {
                            result = v1 / v2;
                            mainEdit.setText(Float.toString(result));
                            div = false;
                        }
                    }
                }
            }
        });
    }
}
