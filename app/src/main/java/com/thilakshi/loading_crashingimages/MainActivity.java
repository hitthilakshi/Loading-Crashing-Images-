package com.thilakshi.loading_crashingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void loadImage(View view) {

        String url = "https://i.picsum.photos/id/576/200/300.jpg?hmac=Uf-okGnisfAphCT3N-WTyzaG-e-r9yvOhY3W43DMWwA";

        Glide.with(this)
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(imageView);

    }
}