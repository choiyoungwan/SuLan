package com.example.someday_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MbtiActive extends AppCompatActivity {

    Button btn_enfj, btn_entj, btn_enfp, btn_entp,
            btn_esfj, btn_estj, btn_esfp, btn_estp,
            btn_infj, btn_intj, btn_infp, bnt_intp,
            btn_isfj, btn_istj, btn_isfp, btn_istp, btnNext4;
    String mbti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbti_activ);

        Intent intent_Nick = getIntent();
        String nick = intent_Nick.getStringExtra("Nick");
        String age = intent_Nick.getStringExtra("Age");
        String year = intent_Nick.getStringExtra("Year");
        String sex = intent_Nick.getStringExtra("Sex");
        System.out.println(nick + age + year + sex + "이것은 인텐트값");

        btn_enfj = findViewById(R.id.btn_enfj);
        btn_entj = findViewById(R.id.btn_entj);
        btn_enfp = findViewById(R.id.btn_enfp);
        btn_entp = findViewById(R.id.btn_entp);
        btn_esfj = findViewById(R.id.btn_esfj);
        btn_estj = findViewById(R.id.btn_estj);
        btn_estp = findViewById(R.id.btn_estp);
        btn_esfp = findViewById(R.id.btn_esfp);
        btn_infj = findViewById(R.id.btn_infj);
        btn_intj = findViewById(R.id.btn_intj);
        btn_infp = findViewById(R.id.btn_infp);
        bnt_intp = findViewById(R.id.btn_intp);
        btn_isfj = findViewById(R.id.btn_isfj);
        btn_istj = findViewById(R.id.btn_istj);
        btn_isfp = findViewById(R.id.btn_isfp);
        btn_istp = findViewById(R.id.btn_istp);


        btnNext4 = findViewById(R.id.btnNext4);


        btn_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(true);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ENFJ";
            }
        });
        btn_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(true);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ENTJ";
            }
        });

        btn_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(true);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ENFP";
            }
        });

        btn_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(true);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ENTP";
            }
        });

        btn_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(true);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ESFJ";
            }
        });
        btn_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(true);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ESTJ";
            }
        });
        btn_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(true);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ESFP";
            }
        });
        btn_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(true);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ESTP";
            }
        });
        btn_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(true);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "INFJ";
            }
        });
        btn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(true);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "INTJ";
            }
        });
        btn_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(true);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "INFP";
            }
        });
        bnt_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(true);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "INTP";
            }
        });
        btn_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(true);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ISFJ";
            }
        });
        btn_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(true);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(false);
                mbti = "ISTJ";
            }
        });
        btn_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(true);
                btn_istp.setSelected(false);
                mbti = "ISFP";
            }
        });
        btn_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_enfj.setSelected(false);
                btn_entj.setSelected(false);
                btn_enfp.setSelected(false);
                btn_entp.setSelected(false);
                btn_esfj.setSelected(false);
                btn_estj.setSelected(false);
                btn_esfp.setSelected(false);
                btn_estp.setSelected(false);
                btn_infj.setSelected(false);
                btn_intj.setSelected(false);
                btn_infp.setSelected(false);
                bnt_intp.setSelected(false);
                btn_isfj.setSelected(false);
                btn_istj.setSelected(false);
                btn_isfp.setSelected(false);
                btn_istp.setSelected(true);
                mbti = "ISTP";
            }
        });


        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Result_Act.class);
                intent.putExtra("Nick", nick);
                intent.putExtra("Age", age);
                intent.putExtra("Year", year);
                intent.putExtra("Sex", sex);
                intent.putExtra("Mbti", mbti);
                startActivity(intent);
            }
        });

    }
}