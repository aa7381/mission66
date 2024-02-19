package com.example.mission6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    Button btn;
    ImageView iv;
    int mone;
    int[] id = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);
        id[0] = R.drawable.random;
        id[1] = R.drawable.banana;
        id[2] = R.drawable.dog;


            }
        

    public void clicked(View view) {
        mone = rnd.nextInt(3);
        if (mone == 0) {
            iv.setImageResource(id[0]);
            btn.setText(String.valueOf(mone + 1));
        } else if (mone == 1) {
            iv.setImageResource(id[1]);
            btn.setText(String.valueOf(mone + 1));
        } else if (mone == 2) {
            iv.setImageResource(id[2]);
            btn.setText(String.valueOf(mone + 1));
        }
    }
}
