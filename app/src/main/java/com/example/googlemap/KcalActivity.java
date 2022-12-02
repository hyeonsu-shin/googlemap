package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KcalActivity extends AppCompatActivity {

    String num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcal);


        Button btn_mer = findViewById(R.id.btn_mer);
        Button btn_per1 = findViewById(R.id.btn_per1);
        Button btn_per2 = findViewById(R.id.btn_per2);
        Button btn1 = findViewById(R.id.btn1);



        EditText et_per = findViewById(R.id.et_per);
        EditText et_po = findViewById(R.id.et_po);
        EditText et_per1 = findViewById(R.id.et_per1);
        EditText et_per2 = findViewById(R.id.et_per2);

        TextView text_mer = findViewById(R.id.text_mer);
        TextView text_per1 = findViewById(R.id.text_per1);
        TextView text_per2 = findViewById(R.id.text_per2);

        btn_mer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input1 = Integer.parseInt(et_per.getText().toString());
                int input2 = Integer.parseInt(et_po.getText().toString());
                int result;

                result = input1 * input2;
                text_mer.setText(""+result);
            }
        });
        btn_per1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int input1 = Integer.parseInt(et_per1.getText().toString());
                int result1;

                result1 = (input1 * 30) + 70 ;
                text_per1.setText("" + result1);

            }
        });
        btn_per2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int input2 = Integer.parseInt(et_per2.getText().toString());
                int result2;

                result2 = (int) ((input2 * 0.75) * 70);
                text_per2.setText(""+result2);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent1 = new Intent(KcalActivity.this, FeedActivity.class);
                startActivity(intent1);
            }

        });
    }
}