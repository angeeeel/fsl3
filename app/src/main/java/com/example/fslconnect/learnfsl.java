package com.example.fslconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

public class learnfsl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnfsl);


        Button alpha, numbers, more, gestures;

        alpha = findViewById(R.id.alpha);
        numbers = findViewById(R.id.numbers);
        more = findViewById(R.id.more);
        gestures = findViewById(R.id.gestures);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabet();
            }
        });

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumbers();
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomepage();
            }
        });
        gestures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGestures();
            }
        });
    }

    public  void openAlphabet(){
        Intent intent = new Intent(this, Alphabet.class);
        startActivity(intent);
    }

    public void openNumbers(){
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);
    }
    public  void openHomepage(){
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
        //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    public void openGestures(){
        Intent intent = new Intent(this, Gestures.class);
        startActivity(intent);
    }
}
