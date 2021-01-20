package com.example.imageview_targil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void click(View view) {
        Random rand = new Random();
        Button button = (Button) findViewById(R.id.button);
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(0);

        int randy = rand.nextInt((3 - 1) + 1) + 1;
        String randu = "" + randy;
        button.setText(randu);
        if (randy == 1) {
            image.setImageResource(R.drawable.one);
        }
        if (randy == 2) {
            image.setImageResource(R.drawable.two);
        }
        if (randy == 3) {
            image.setImageResource(R.drawable.three);
        }
    }
}
