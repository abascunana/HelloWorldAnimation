package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;

import android.os.Bundle;
import android.text.Layout;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.texto );

        FlingAnimation fling = new FlingAnimation(mTextView, DynamicAnimation.SCROLL_X);
        int velocityX = 4;
        int maxScroll = 1000;
        fling.setStartVelocity(-5000)
                .setMinValue(0)
                .setMaxValue(maxScroll)
                .setFriction(1.1f)
                .setMinValue(-2000)
                .setMaxValue(5);
        fling.setMinimumVisibleChange(DynamicAnimation.MIN_VISIBLE_CHANGE_SCALE);
        fling.start();





    }

}