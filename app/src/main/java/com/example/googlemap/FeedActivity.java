package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn_feed1 = findViewById(R.id.btn_feed1);
        Button btn_feed2 = findViewById(R.id.btn_feed2);
        Button btn_feed3 = findViewById(R.id.btn_feed3);
        Button btn_feed4 = findViewById(R.id.btn_feed4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent1 = new Intent(FeedActivity.this, MapActivity.class);
                startActivity(intent1);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent2 = new Intent(FeedActivity.this, RecommendSpot.class);
                startActivity(intent2);
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent3 = new Intent(FeedActivity.this, FeedActivity.class);
                startActivity(intent3);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent4 = new Intent(FeedActivity.this, MainActivity.class);
                startActivity(intent4);
            }

        });
        btn_feed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent5 = new Intent(FeedActivity.this, KcalActivity.class);
                startActivity(intent5);
            }

        });
        btn_feed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent6 = new Intent(FeedActivity.this, FeedrecommendationActivity.class);
                startActivity(intent6);
            }

        });
        btn_feed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent7 = new Intent(FeedActivity.this, WalkingtoolActivity.class);
                startActivity(intent7);
            }

        });
        btn_feed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent8 = new Intent(FeedActivity.this, FeedtipActivity.class);
                startActivity(intent8);
            }

        });





    }
}