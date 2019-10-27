package com.example;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.reactiontimecalculator.MainActivity;
import com.example.reactiontimecalculator.R;

import java.util.Date;
import java.util.Random;

public class letsPlay extends AppCompatActivity {
 public void onBackPressed(){
    Intent intent =new Intent(this, MainActivity.class);
    startActivity(intent);
    return;
}
protected void randomPosition()
{  final Date start=new Date();
    final long time1= start.getTime();
    Random r=new Random();
    ImageButton imageButton3=findViewById(R.id.imageButton3);
    int imageH=imageButton3.getHeight()+176;
    int imageW=imageButton3.getWidth()+50;
    DisplayMetrics dp=new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(dp);
    int width=dp.widthPixels;
    int height=dp.heightPixels;
    imageButton3.setX(r.nextInt((width-imageW)));
    imageButton3.setY(r.nextInt(height-imageH));
    imageButton3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date End=new Date();
            long time2=End.getTime();
            float RTime=time2-time1;
            TextView tv=findViewById(R.id.tv1);

            tv.setText("Reaction time="+(RTime/1000)+"s");
            randomPosition();

        }
    });
}
    protected  void  onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.letsplay);
        randomPosition();

    }
}
