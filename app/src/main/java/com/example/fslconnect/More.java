package com.example.fslconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);


        Button what, law;

        what = findViewById(R.id.what);
        law = findViewById(R.id.law);


        what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwhat();
            }
        });
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFSL();
            }
        });
    }
    public void openwhat(){
        Intent intent = new Intent(this, What.class);
        startActivity(intent);
    }

    public void openFSL(){
        Intent intent = new Intent(this, FSL.class);
        startActivity(intent);
    }

}