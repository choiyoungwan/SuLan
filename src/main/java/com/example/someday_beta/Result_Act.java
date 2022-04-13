package com.example.someday_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result_Act extends AppCompatActivity {



    TextView result_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_act);
        Intent intent_Nick = getIntent();
        String nick = intent_Nick.getStringExtra("Nick");
        String age = intent_Nick.getStringExtra("Age");
        String year = intent_Nick.getStringExtra("Year");
        String sex = intent_Nick.getStringExtra("Sex");
        String mbti = intent_Nick.getStringExtra("Mbti");
        System.out.println(nick+age+year+sex+mbti+"이것은 인텐트값");
result_txt = findViewById(R.id.result_txt);

result_txt.setTextSize(40);

        result_txt.setText("닉네임 : "+nick+"\n"+"나 이 : "+age+year+"\n"
                +"성 별 : "+sex+"\n"
                +"MBTI : "+mbti+"\n");

    }
}