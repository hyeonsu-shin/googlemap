package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    private DatabaseReference mDatabaseRdf ;    // 실시간 데이터베이스
    private FirebaseDatabase database;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Btnsporting = findViewById(R.id.btn_sporting);
        Button Btnhound = findViewById(R.id.btn_hound);
        Button Btnworking = findViewById(R.id.btn_working);
        Button Btnterrier = findViewById(R.id.btn_terrier);
        Button Btntoy = findViewById(R.id.btn_toy);
        Button Btnnonsporting = findViewById(R.id.btn_nonsporting);
        Button Btnherding = findViewById(R.id.btn_herding);
        Button Btnread = findViewById(R.id.read_btn);

        Btnsporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = new Intent(MainActivity.this, SprtinggroupActivity.class);
                startActivity(intent5);
               }
        });
        Btnhound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = new Intent(MainActivity.this, HoundgroupActivity.class);
                startActivity(intent6);
            }
        });
        Btnworking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent7 = new Intent(MainActivity.this, WorkinggroupActivity.class);
                startActivity(intent7);
            }
        });
        Btnterrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent8 = new Intent(MainActivity.this,TerriergroupActivity.class);
                startActivity(intent8);
            }
        });
        Btntoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent9 = new Intent(MainActivity.this,ToygroupActivity.class);
                startActivity(intent9);
            }
        });
        Btnnonsporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent10 = new Intent(MainActivity.this,NonsportinggroupActivity.class);
                startActivity(intent10);
            }
        });
        Btnherding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent11 = new Intent(MainActivity.this,HerdinggroupActivity.class);
                startActivity(intent11);
            }
        });
        Btnread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.akc.org/dog-breeds/"));
                startActivity(urlintent);
            }
        });


        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent1 = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent1);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent2 = new Intent(MainActivity.this, RecommendSpot.class);
                startActivity(intent2);
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent3 = new Intent(MainActivity.this, FeedActivity.class);
                startActivity(intent3);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent4 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent4);
            }

        });
    }
}