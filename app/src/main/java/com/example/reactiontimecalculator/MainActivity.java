package com.example.reactiontimecalculator;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import com.example.popup;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public void onBackPressed(){
        finish();



        return;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imgBtn=findViewById(R.id.imageButton);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,popup.class);
                startActivity(intent);
            }
        });





    }

}
