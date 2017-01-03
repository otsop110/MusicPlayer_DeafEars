package com.example.android.deafears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        //Finds the view that shows what is currently playing.
        TextView playing = (TextView) findViewById(R.id.playing);

        //Sets a click listener on the Now playing view.
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AlbumActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
