package com.example.multimediaapp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reproducirAudioButton = findViewById(R.id.playAudioButton);
        reproducirAudioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.minesoundaudio);
                mediaPlayer.start();
            }
        });

        VideoView videoView = findViewById(R.id.videoView);
        Button reproducirVideoButton = findViewById(R.id.playvideoButton);
        reproducirVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.gatobailevideo);
                videoView.setVideoURI(videoUri);
                videoView.start();
            }
        });

        Button animarButton = findViewById(R.id.playAnimButton);
        final ImageView imageView = findViewById(R.id.imageVIew);
        animarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fadeInAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_in);
                imageView.startAnimation(fadeInAnimation);
            }
        });

        //if()
    }
}