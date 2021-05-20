package com.example.fslconnect;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class Gestures extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper view;
    Button next, previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestures);
        view = findViewById(R.id.view);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }
    public void onClick(View v){
        if (v == next){
            view.showNext();
        }
        else if (v == previous){
            view.showPrevious();
        }

    }

}