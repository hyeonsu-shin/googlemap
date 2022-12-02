package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WalkingtoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkingtool);
        Button btn1 = findViewById(R.id.btn1);

        //  트루러브 하네스 TLH1911
        TextView we1 = (TextView) findViewById(R.id.we1);
        String text1 = "10,600원";
        we1.setText(text1);

        Linkify.TransformFilter linktest1 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern1 = Pattern.compile("10,600원");
        Linkify.addLinks(we1, pattern1, "https://www.kroomize.com/product/detail.html?product_no=225&cate_no=167&display_group=1", null, linktest1);

        //  트루러브 목줄TLC5011
        TextView we2 = (TextView) findViewById(R.id.we2);
        String text2 = "15,500원";
        we2.setText(text2);

        Linkify.TransformFilter linktest2 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern2 = Pattern.compile("15,500원");
        Linkify.addLinks(we2, pattern2, "https://www.kroomize.com/product/detail.html?product_no=223&cate_no=108&display_group=1", null, linktest2);

        //  레스코 오리지널 리드줄
        TextView we3 = (TextView) findViewById(R.id.we3);
        String text3 = "22,000원";
        we3.setText(text3);

        Linkify.TransformFilter linktest3 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern3 = Pattern.compile("22,000원");
        Linkify.addLinks(we3, pattern3, "https://www.kroomize.com/product/detail.html?product_no=100&cate_no=108&display_group=1", null, linktest3);

        //  바비온 물병
        TextView we4 = (TextView) findViewById(R.id.we4);
        String text4 = "12,900원";
        we4.setText(text4);

        Linkify.TransformFilter linktest4 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern4 = Pattern.compile("12,900원");
        Linkify.addLinks(we4, pattern4, "https://smartstore.naver.com/babionkorea/products/5178034073?NaPm=ct%3Dlav52600%7Cci%3De10b3ff338c3acf66199b537ec91b9b6a3854b5c%7Ctr%3Dslsbrc%7Csn%3D358191%7Chk%3D8b423cd38bbc1dbf27165565b70a745cb669c7fe", null, linktest4);

        //  리치독스 물병
        TextView we5 = (TextView) findViewById(R.id.we5);
        String text5 = "9,800원";
        we5.setText(text5);

        Linkify.TransformFilter linktest5 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern5 = Pattern.compile("9,800원");
        Linkify.addLinks(we5, pattern5, "https://smartstore.naver.com/richdogs/products/5007358545?NaPm=ct%3Dlav50wh4%7Cci%3D3766bf29735dd4b96f47410126c26a83e2e65445%7Ctr%3Dsls%7Csn%3D772538%7Chk%3D9b00c82171eaf6343f303d90c0a9bce4c8c8874b", null, linktest5);

        // 풉백 강아지 배변봉투
        TextView we6 = (TextView) findViewById(R.id.we6);
        String text6 = "8롤 120매 2900원";
        we6.setText(text6);

        Linkify.TransformFilter linktest6 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern6 = Pattern.compile("8롤 120매 2900원");
        Linkify.addLinks(we6, pattern6, "https://smartstore.naver.com/mungdoggy/products/7472710786?NaPm=ct%3Dlav4ylww%7Cci%3D72752d1a52eef494c3420da1f168a9f136e6a066%7Ctr%3Dslct%7Csn%3D934027%7Chk%3D8c71edb172a85e06180c9d23fd80c91086649a72", null, linktest6);

        //  비마이펫 x 말러 산책가방
        TextView we7 = (TextView) findViewById(R.id.we7);
        String text7 = "42,400원";
        we7.setText(text7);

        Linkify.TransformFilter linktest7 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern7 = Pattern.compile("42,400원");
        Linkify.addLinks(we7, pattern7, "https://store.bemypet.kr/product/%eb%b9%84%eb%a7%88%ec%9d%b4%ed%8e%ab-x-%eb%a7%90%eb%9f%ac-%ea%b0%95%ec%95%84%ec%a7%80-%ec%82%b0%ec%b1%85%ea%b0%80%eb%b0%a9/", null, linktest7);


        //  마이플러피 어쓰백
        TextView we8 = (TextView) findViewById(R.id.we8);
        String text8 = "38,900원";
        we8.setText(text8);

        Linkify.TransformFilter linktest8 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern8 = Pattern.compile("38,900원");
        Linkify.addLinks(we8, pattern8, "https://www.biteme.co.kr/shop/product/product_view?product_cd=1000013184&NaPm=ct%3Dlav5u134%7Cci%3D96c69706fff2d9b517e1746365631a06106e17ab%7Ctr%3Dslsc%7Csn%3D449979%7Chk%3D97768ef3b91f8e19fc5b5f6b5af6b101af8a9a6a", null, linktest8);

        //  댕스러빗 쿼드백
        TextView we9 = (TextView) findViewById(R.id.we9);
        String text9 = "39,800원";
        we9.setText(text9);

        Linkify.TransformFilter linktest9 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern9 = Pattern.compile("39,800원");
        Linkify.addLinks(we9, pattern9, "https://smartstore.naver.com/dengsloveit/products/6756893534?NaPm=ct%3Dlav5xyag%7Cci%3Dbf32e3ba7793954b8fbe25af0397eaf06763657e%7Ctr%3Dslsl%7Csn%3D4041238%7Chk%3Df4a18af829428db1b7b48776c08c31a409fc9ccf", null, linktest9);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent1 = new Intent(WalkingtoolActivity.this, FeedActivity.class);
                startActivity(intent1);
            }

        });
    }
}