package com.example.someday_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgeActive extends AppCompatActivity {

    Button btnAge20, btnAge30, btnAge40,
    btnFirst, btnMiddle , btnEnd, btnNext2;

    String nextAge,nextyear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.age_activ);
        Intent intent_Nick = getIntent();
        String nick = intent_Nick.getStringExtra("Nick");
        System.out.println(nick+"이것은 인텐트값");
        //Toast.makeText(this, aa, Toast.LENGTH_SHORT).show();

        btnAge20 = findViewById(R.id.btnAge20);
        btnAge30 = findViewById(R.id.btnAge30);
        btnAge40 = findViewById(R.id.btnAge40);
        btnFirst = findViewById(R.id.btnFirst);
        btnMiddle = findViewById(R.id.btnMiddle);
        btnEnd = findViewById(R.id.btnEnd);
        btnNext2 = findViewById(R.id.btnNext2);

        btnAge20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnAge20.setSelected(true);
                btnAge30.setSelected(false);
                btnAge40.setSelected(false);
                nextAge = "20대";
            }
        });

        btnAge30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnAge20.setSelected(false);
                btnAge30.setSelected(true);
                btnAge40.setSelected(false);
                nextAge = "30대";
            }
        });

        btnAge40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnAge20.setSelected(false);
                btnAge30.setSelected(false);
                btnAge40.setSelected(true);
                nextAge = "40대";
            }
        });

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFirst.setSelected(true);
                btnMiddle.setSelected(false);
                btnEnd.setSelected(false);
                nextyear = "초반";
            }
        });

        btnMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFirst.setSelected(false);
                btnMiddle.setSelected(true);
                btnEnd.setSelected(false);
                nextyear = "중반";
            }
        });


        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFirst.setSelected(false);
                btnMiddle.setSelected(false);
                btnEnd.setSelected(true);
                nextyear = "후반";
            }
        });


        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SexActive.class);
                intent.putExtra("Nick",nick);
                intent.putExtra("Age",nextAge);
                intent.putExtra("Year",nextyear);
                startActivity(intent);
            }
        });



    }
}