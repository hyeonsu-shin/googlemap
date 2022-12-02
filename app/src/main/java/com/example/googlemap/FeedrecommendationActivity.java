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

public class FeedrecommendationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedrecommendation);

        Button btn1 = findViewById(R.id.btn1);

        //  1번사료 이즈칸 소프트 살몬
        TextView kg1 = (TextView) findViewById(R.id.kg1);
        String text1 = "6Kg 39,920원";
        kg1.setText(text1);

        Linkify.TransformFilter linktest1 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern1 = Pattern.compile("6Kg 39,920원");
        Linkify.addLinks(kg1, pattern1, "https://brand.naver.com/irion-mall/products/5965450900?NaPm=ct%3Dlauol4go%7Cci%3D1f5b72be5480836c9ae87535a1d8357c4e7c0dcd%7Ctr%3Dslsbrc%7Csn%3D4814285%7Chk%3D9628c07bfe17ba11ef5c85a5bbd7caa4c2c0a6a0", null, linktest1);

        //  2번사료 로우즈 독 밀프리 LID연어 1.5Kg
        TextView kg2 = (TextView) findViewById(R.id.kg2);
        String text2 = "1.5Kg 55,800원";
        kg2.setText(text2);

        Linkify.TransformFilter linktest2 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern2 = Pattern.compile("1.5Kg 55,800원");
        Linkify.addLinks(kg2, pattern2, "https://smartstore.naver.com/rawz/products/2262612657?NaPm=ct%3Dlauoqaf4%7Cci%3Dc41f7587fd30bf34e4a52dcd11e0f21385bb5a6b%7Ctr%3Dsls%7Csn%3D584833%7Chk%3Dfca42a8ed3fa1c3018e172f3a2015d737ad9ecb5", null, linktest2);

        //  3번사료 아키나 독 싱글즈 프리런 덕 6KG
        TextView kg3 = (TextView) findViewById(R.id.kg3);
        String text3 = "6Kg 62,500원";
        kg3.setText(text3);

        Linkify.TransformFilter linktest3 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern3 = Pattern.compile("6Kg 62,500원");
        Linkify.addLinks(kg3, pattern3, "https://mdoggie.cafe24.com/product/detail.html?product_no=11953&cate_no=337&display_group=1&cafe_mkt=naver_ks&mkt_in=Y&ghost_mall_id=naver&ref=naver_open&NaPm=ct%3Dlauoug40%7Cci%3D7fcb7219a751560b052b560889f606bfb6266e14%7Ctr%3Dslsl%7Csn%3D152326%7Chk%3D5616dbf94278e50feee81936b3592c3d0c985818", null, linktest3);

        //  4번사료 빅독 빅바이트 캥거루
        TextView kg4 = (TextView) findViewById(R.id.kg4);
        String text4 = "1Kg 92,900원";
        kg4.setText(text4);

        Linkify.TransformFilter linktest4 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern4 = Pattern.compile("1Kg 92,900원");
        Linkify.addLinks(kg4, pattern4, "https://www.petshome.co.kr/1193110695/?idx=777&NaPm=ct%3Dlaup2i8g%7Cci%3D90ba800c8f13296673e082f85abf6a256b078023%7Ctr%3Dslsl%7Csn%3D1085355%7Chk%3D538ca12e9809a108f21d3bace3ddf5278ea24e62", null, linktest4);

        //  5번사료 빅독 이즈칸 램 30
        TextView kg5 = (TextView) findViewById(R.id.kg5);
        String text5 = "7.5Kg 49,900원";
        kg5.setText(text5);

        Linkify.TransformFilter linktest5 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern5 = Pattern.compile("7.5Kg 49,900원");
        Linkify.addLinks(kg5, pattern5, "https://brand.naver.com/irion-mall/products/5965463215", null, linktest5);

        //  6번사료 파미나 펌프킨 멧돼지
        TextView kg6 = (TextView) findViewById(R.id.kg6);
        String text6 = "7Kg 100,700원";
        kg6.setText(text6);

        Linkify.TransformFilter linktest6 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern6 = Pattern.compile("7Kg 100,700원");
        Linkify.addLinks(kg6, pattern6, "http://farmina.co.kr/shop/product/?mode=view&cate=CT00000012&depth=3&order_type=pdtRPrice&search_filter=&rpage=20&pidx=PD00000290", null, linktest6);

        //  7번사료 퓨리나 프로플랜 퍼포먼스
        TextView kg7 = (TextView) findViewById(R.id.kg7);
        String text7 = "17Kg 66,000원";
        kg7.setText(text7);

        Linkify.TransformFilter linktest7 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern7 = Pattern.compile("17Kg 66,000원");
        Linkify.addLinks(kg7, pattern7, "https://www.purinapetcare.co.kr/shop/product_view.php?c1_idx=1&order_by=md&this_tab=&pd_idx=1053", null, linktest7);


        //  8번사료 카르나4 오리지널 치킨
        TextView kg8 = (TextView) findViewById(R.id.kg8);
        String text8 = "1.36Kg 43,900원";
        kg8.setText(text8);

        Linkify.TransformFilter linktest8 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern8 = Pattern.compile("1.36Kg 43,900원");
        Linkify.addLinks(kg8, pattern8, "https://smartstore.naver.com/montraum/products/5127880025?NaPm=ct%3Dlaupcnz4%7Cci%3D30af0124d914ebd23cb7e5d8f5de639170d5d395%7Ctr%3Dslsbrc%7Csn%3D585567%7Chk%3Dbf0f5726c61e53c2cdad706bb0ea574ab95c41c1", null, linktest8);

        //  9번사료 몬지 비와일드 그레인프리 올브리드 어덜트 오리
        TextView kg9 = (TextView) findViewById(R.id.kg9);
        String text9 = "2.5Kg 54,000원";
        kg9.setText(text9);

        Linkify.TransformFilter linktest9 = new Linkify.TransformFilter() {
            @Override
            public String transformUrl(Matcher match, String url) {
                return "";
            }
        };
        Pattern pattern9 = Pattern.compile("2.5Kg 54,000원");
        Linkify.addLinks(kg9, pattern9, "https://www.mongekorea.co.kr/bwild/?idx=284", null, linktest9);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent1 = new Intent(FeedrecommendationActivity.this, FeedActivity.class);
                startActivity(intent1);
            }

        });
    }
}