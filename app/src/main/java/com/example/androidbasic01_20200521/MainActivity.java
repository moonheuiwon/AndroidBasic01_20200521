package com.example.androidbasic01_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidbasic01_20200521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setUpEvents();
        setValues();
    }
//    이벤트 처리 코드 모아두는 곳
    void setUpEvents() {

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FirstActivity로 이동.
//                비행기 티켓 발권
                Intent myIntent = new Intent(MainActivity.this, FirstActivity.class);
//                실제 출발
                startActivity(myIntent);

//                이 액티비티를 종료하는 코드 (이동처럼 보이도록 처리)
//                finish();
            }
        });

        binding.goToSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntend = new Intent(MainActivity.this, SecondActivity.class);

                startActivity(secondIntend);
            }
        });

    }
//    화면에 나와야할 데이터 세팅 코드 모아두는 곳
    void setValues() {

    }

}
