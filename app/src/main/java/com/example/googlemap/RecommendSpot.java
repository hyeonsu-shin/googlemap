package com.example.googlemap;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RecommendSpot extends FragmentActivity implements GoogleMap.OnMyLocationButtonClickListener, GoogleMap.OnMyLocationClickListener, OnMapReadyCallback {

    private GoogleMap mMap;
    private int MY_LOCATION_REQUEST_CODE=1; //추가 문자에 숫자를 넣는것을 프로그래밍에서는 정의한다 라고 합니다.

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_spot);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent1 = new Intent(RecommendSpot.this, MapActivity.class);
                startActivity(intent1);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent2 = new Intent(RecommendSpot.this, RecommendSpot.class);
                startActivity(intent2);
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent3 = new Intent(RecommendSpot.this, FeedActivity.class);
                startActivity(intent3);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //화면전환
                Intent intent4 = new Intent(RecommendSpot.this, MainActivity.class);
                startActivity(intent4);
            }

        });

    }

    /*추가부분 */
    public void onRequestPermissonResult(int requestCode,String[] permissions,int[] grantResult){
        if(requestCode == MY_LOCATION_REQUEST_CODE){
            if(permissions.length == 1 &&
                    permissions[0] == Manifest.permission.ACCESS_FINE_LOCATION &&
                    grantResult[0] == PackageManager.PERMISSION_GRANTED) {
                if(checkCallingPermission(Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        checkCallingPermission(Manifest.permission.ACCESS_COARSE_LOCATION)!=
                                PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this,new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
                }
                mMap.setMyLocationEnabled(true);
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // 추가코드
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this);

        //송도 도그파크 위도 경도 좌표 넣기
        LatLng incheon1 = new LatLng(37.408813, 126.633788);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("송도 도그파크"));

        //컨벤시아교, 아트센터교 산책로 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.392268, 126.663445);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("컨벤시아교, 아트센터교 산책로"));

        //새터 어린이 공원 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.388182, 126.659291);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("새터 어린이 공원"));

        //송도 센트럴파크 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.392507, 126.639382);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("송도 센트럴파크"));

        //해돋이 공원 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.387709, 126.654522);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("해돋이 공원"));

        //미추홀 공원 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.387709, 126.654522);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("미추홀 공원"));

        //송도달빛축제 공원 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.406385, 126.633813);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("송도달빛축제 공원"));

        //송도글로벌파크 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.376252, 126.659384);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("송도글로벌파크"));

        //양쥬레브 송도점 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.380412, 126.660598);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("양쥬레브 송도점(애견카페)"));

        //도그랑차차 애견카페 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.397942, 126.651392);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("도그랑차차(애견카페)"));

        //리츠펫 송도점 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.395335, 126.646261);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("리츠펫 송도점(애견펫페)"));

        //인천대학교 위도 경도 좌표 넣기
        incheon1 = new LatLng(37.375029, 126.632793);
        mMap.addMarker(new MarkerOptions().position(incheon1).title("인천대학교"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(incheon1));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(incheon1, 16));//지도를 14배율로 확대해서 보여줌
    }

    @Override
    public boolean onMyLocationButtonClick() {

        Toast.makeText(this,"MyLocation clicked", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(this,"Current location:\n" + location, Toast.LENGTH_LONG).show();

    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }


}