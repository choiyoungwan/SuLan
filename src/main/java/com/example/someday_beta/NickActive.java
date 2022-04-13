package com.example.someday_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NickActive extends AppCompatActivity {

    EditText Nick_Et;
    Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nick_activ);

        Nick_Et = findViewById(R.id.et_Nick);
        btnNext1 = findViewById(R.id.btnNext1);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AgeActive.class);
                intent.putExtra("Nick",Nick_Et.getText().toString());
                startActivity(intent);
            }
        });

    }
}