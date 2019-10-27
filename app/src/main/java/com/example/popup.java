package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;

import com.example.reactiontimecalculator.MainActivity;
import com.example.reactiontimecalculator.R;

import java.util.Date;

public class popup extends AppCompatActivity {
   /* public void onBackPressed(){
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
        return;
    }*/

    public  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
      setContentView(R.layout.popup1);
       /* DisplayMetrics dm =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width =dm.widthPixels;
        int height =dm.heightPixels;
        getWindow().setLayout((int)(width*(0.9)),(int)(height*(0.4)));*/
        ImageButton imageButton=findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(popup.this,letsPlay.class);
                startActivity(intent);


            }
        });
    }
}
