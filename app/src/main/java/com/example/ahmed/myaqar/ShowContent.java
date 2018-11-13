package com.example.ahmed.myaqar;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowContent extends AppCompatActivity {
    String Title, Description;
    int Image;
    TextView title, description;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_content);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        imageView = findViewById(R.id.imageView);




        Bundle bundle = getIntent().getExtras();
        if (bundle != null)

        {
            Title = bundle.getString("Title");
            Description = bundle.getString("Description");
            Image = bundle.getInt("Image");
            title.setText(Title);
            description.setText(Description);
            imageView.setImageResource(Image);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        } else {

        }
    }




    public void call(View view) {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 100);
                return;
            }

        }

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:123456789"));

        startActivity(callIntent);
        }
    }




