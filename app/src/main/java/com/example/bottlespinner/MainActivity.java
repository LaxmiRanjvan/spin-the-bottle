package com.example.bottlespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView bottelImage;
    int currentPoint;
    int nextPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottelImage = findViewById(R.id.bottel);
        bottelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinbottle();

            }

        });
    }
        private void spinbottle() {
        nextPoint=new Random().nextInt(5000);
        int pX=bottelImage.getWidth()/2;
        int pY=bottelImage.getHeight()/2;


        Animation rotate = new RotateAnimation(currentPoint,nextPoint,pX,pY);
            rotate.setDuration(3000);
            rotate.setFillAfter(true);
            currentPoint = nextPoint;
            bottelImage.startAnimation(rotate);



        }

}