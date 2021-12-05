package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button rotBtn,bliBtn,bouBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation
                rotate = AnimationUtils.loadAnimation(this,R.anim.rotate);
        Animation
                blink = AnimationUtils.loadAnimation(this,R.anim.blink);
        Animation
                bounce = AnimationUtils.loadAnimation(this,R.anim.bounce);

        rotBtn = findViewById(R.id.rotateBtn);
        bliBtn = findViewById(R.id.blinkBtn);
        bouBtn = findViewById(R.id.bounceBtn);

        final TextView blinkTxt = findViewById(R.id.blinkView);
        final TextView bounceTxt = findViewById(R.id.bounceView);
        final TextView rotateTxt = findViewById(R.id.rotateView);

        rotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateTxt.startAnimation(rotate);
            }
        });

        bliBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blinkTxt.startAnimation(blink);
            }
        });

        bouBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bounceTxt.startAnimation(bounce);
            }
        });
    }
}