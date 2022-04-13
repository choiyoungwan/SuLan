package com.example.someday_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SexActive extends AppCompatActivity {


    Button btnMale, btnFeMale, btnNext3;
String sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sex_activ);

        Intent intent_Nick = getIntent();
        String nick = intent_Nick.getStringExtra("Nick");
        String age = intent_Nick.getStringExtra("Age");
        String year = intent_Nick.getStringExtra("Year");
        System.out.println(nick+age+year+"이것은 인텐트값");

        btnMale= findViewById(R.id.btnMale);
        btnFeMale= findViewById(R.id.btnFemale);
        btnNext3= findViewById(R.id.btnNext3);


        btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMale.setSelected(true);
                btnFeMale.setSelected(false);

                sex = "남성";
            }
        });

        btnFeMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMale.setSelected(false);
                btnFeMale.setSelected(true);

                sex = "여성";
            }
        });


        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiActive.class);
                intent.putExtra("Nick",nick);
                intent.putExtra("Age",age);
                intent.putExtra("Year",year);
                intent.putExtra("Sex",sex);
                startActivity(intent);
            }
        });



    }
}