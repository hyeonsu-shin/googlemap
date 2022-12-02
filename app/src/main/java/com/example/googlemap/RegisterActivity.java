package com.example.googlemap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class RegisterActivity extends AppCompatActivity {



    private FirebaseAuth mFirebaseAuth;         // .파이어베이스 인증
    private DatabaseReference mDatabaseRdf ;    // 실시간 데이터베이스
    private EditText mEtEmail;                  // 회원가입 입력 필드
    private EditText mEtPwd;                    // 회원가입 입력 필드
    private RadioGroup rb_gender;
    private RadioButton rb_a, rb_b, rb_c, rb_d, rb_e, rb_f,rb_g;
    private Button mBtnRegister;                // 회원가입 버튼
    private String str_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);





    rb_gender =findViewById(R.id.rb_gender); // 라디오 버튼들을 담고 있는 그룹
    rb_a = findViewById(R.id.rb_a);            // 라이오 버튼
    rb_b = findViewById(R.id.rb_b);
    rb_c = findViewById(R.id.rb_c);
    rb_d = findViewById(R.id.rb_d);
    rb_e = findViewById(R.id.rb_e);
    rb_f = findViewById(R.id.rb_f);
    rb_g = findViewById(R.id.rb_g);

        rb_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // 라디오 버튼들의 상태 값의 변경됨을 감지
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if(i == R.id.rb_a){
                Toast.makeText(RegisterActivity.this, "매일 운동 1시간", Toast.LENGTH_SHORT).show();
                str_result=rb_a.getText().toString(); //라디오 버튼의 text 값을 String에 담아줌
            } else if(i == R.id.rb_b){
                Toast.makeText(RegisterActivity.this, "매일 운동 30분 ~ 1시간", Toast.LENGTH_SHORT).show();
                str_result=rb_b.getText().toString();
            }else if(i == R.id.rb_c){
                Toast.makeText(RegisterActivity.this, "매일 운동 2시간", Toast.LENGTH_SHORT).show();
                str_result=rb_c.getText().toString();
            }else if(i == R.id.rb_d){
                Toast.makeText(RegisterActivity.this, "매일 운동 1시간 ~ 1시간 30분", Toast.LENGTH_SHORT).show();
                str_result=rb_d.getText().toString();
            }else if(i == R.id.rb_e){
                Toast.makeText(RegisterActivity.this, "매일 운동 30분 ~ 1시간", Toast.LENGTH_SHORT).show();
                str_result=rb_e.getText().toString();
            }else if(i == R.id.rb_f){
                Toast.makeText(RegisterActivity.this, "매일 운동 20분 ~ 1시간", Toast.LENGTH_SHORT).show();
                str_result=rb_f.getText().toString();
            }else if(i == R.id.rb_g){
                Toast.makeText(RegisterActivity.this, "다른 그룹에 있는 비슷한 견종의 기준을 추천", Toast.LENGTH_SHORT).show();
                str_result=rb_g.getText().toString();
            }
        }
    });


    mFirebaseAuth = FirebaseAuth.getInstance();
    mDatabaseRdf= FirebaseDatabase.getInstance().getReference("멍데이");


    mEtEmail = findViewById(R.id.et_email);
    mEtPwd = findViewById(R.id.et_pwd);


    mBtnRegister = findViewById(R.id.btn_register);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {

            // 회원가입 처리 시작
            String strEmail = mEtEmail.getText().toString();
            String strPwd = mEtPwd.getText().toString();


            // FirebaseAuth 진행 처리

            mFirebaseAuth.createUserWithEmailAndPassword(strEmail, strPwd).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task)
                {
                    if (task.isSuccessful()){
                        FirebaseUser firebaseUser = mFirebaseAuth.getCurrentUser();

                        UserAccount account = new UserAccount();
                        account.setIdToken(firebaseUser.getUid());
                        account.setEmailId(firebaseUser.getEmail());
                        account.setPassword(strPwd);
                        account.setGroup(str_result);




                        //setValue : database에 inset 행위
                        mDatabaseRdf.child("UserAccount").child(firebaseUser.getUid()).setValue(account);


                        Toast.makeText(RegisterActivity.this, "회원가입에 성공하셨습니다.", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);

                        finish();
                    }else
                    { Toast.makeText(RegisterActivity.this, "회원가입에 실패하셨습니다.", Toast.LENGTH_SHORT).show();


                    }



                }


            });



        }
    });
}
}