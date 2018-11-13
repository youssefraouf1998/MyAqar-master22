package com.example.ahmed.myaqar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Welcome extends AppCompatActivity {
    ImageView imageView , imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        imageView = findViewById(R.id.commerical);
        imageView2 = findViewById(R.id.investment);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this,Navi_Navi_Navi.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Glide.with(this).load(R.drawable.commerical).into(imageView);
        Glide.with(this).load(R.drawable.investment).into(imageView2);
    }
}
