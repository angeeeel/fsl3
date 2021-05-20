package com.example.fslconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Alphabet extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlipper;
    Button next, previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);


        viewFlipper = findViewById(R.id.viewflipper);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }
    public void onClick(View v){
        if (v == next){
            viewFlipper.showNext();
        }
        else if (v == previous){
            viewFlipper.showPrevious();
        }

    }

}
