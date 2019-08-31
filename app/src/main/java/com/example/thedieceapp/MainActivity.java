package com.example.thedieceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button RollButton;
    ImageView dicee1 , dicee2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RollButton = findViewById(R.id.roll_btn);
        dicee1 = findViewById(R.id.iv_1);
        dicee2 = findViewById(R.id.iv_2);

       final  int[] diceearray = new int[]{
                R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6
        };


        RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Random randomnumber = new Random();

                int leftnumber = randomnumber.nextInt(6);

                dicee1.setImageResource(diceearray[leftnumber]);

                int rightnumber = randomnumber.nextInt(6);

                dicee2.setImageResource(diceearray[rightnumber]);
            }
        });


    }
}
