package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img_blink;
    private Button start_tween;
    private Button pause_tween;
    private Button backbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_blink = findViewById(R.id.animImageView);
        start_tween = findViewById(R.id.startButton);
        pause_tween = findViewById(R.id.pausebutton);
        backbutton = findViewById(R.id.backbutton);

        Animation blinAnimation = AnimationUtils.loadAnimation(this,R.anim.animaziya);

        start_tween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {img_blink.startAnimation(blinAnimation);}
        });
        pause_tween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { img_blink.clearAnimation(); }
        });
        backbutton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });


    }
}