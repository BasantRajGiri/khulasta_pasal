package com.example.giri.khulasta_pasal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Map extends AppCompatActivity {

    MediaPlayer mysong;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        btn2 = (Button) findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Map.this , Vedio.class);
                startActivity(intent);
            }
        });



        mysong = MediaPlayer.create(Map.this,R.raw.khulasta);
    }


    public void  buttonclick(View view){
        mysong.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mysong.release();
    }
}
