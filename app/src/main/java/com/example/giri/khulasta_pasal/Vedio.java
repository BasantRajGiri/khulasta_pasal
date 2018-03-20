package com.example.giri.khulasta_pasal;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Vedio extends AppCompatActivity {


    Button button;
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);


        button = (Button) findViewById(R.id.btn1);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);
    }

    public void buttonclick(View view){
        String videopath = "android.resource://com.example.giri.khulasta_pasal/"+R.raw.kale;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

    }
}
