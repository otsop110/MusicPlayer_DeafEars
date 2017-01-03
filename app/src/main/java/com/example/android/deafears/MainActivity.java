package com.example.android.deafears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the content of the activity to use the activity_main.xml layout file.
        setContentView(R.layout.activity_main);

        //Finds the view that shows the My Library tab.
        TextView library = (TextView) findViewById(R.id.library);

        //Sets a click listener on the library view.
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        //Finds the view that shows the Playlists tab.
        TextView playlist = (TextView) findViewById(R.id.playlists);

        //Sets a click listener on the Playlists view.
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        //Finds the view that shows the Explore tab.
        TextView explore = (TextView) findViewById(R.id.explore);

        //Sets a click listener on the Explore view.
        explore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the explore View is clicked on.
            @Override
            public void onClick(View view) {
                Intent exploreIntent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(exploreIntent);
            }
        });

        //Finds the view that shows what is currently playing.
        TextView playing = (TextView) findViewById(R.id.playing);

        //Sets a click listener on the Now playing view.
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        //Finds the view that shows the contents of each album.
        TextView album_one = (TextView) findViewById(R.id.album_one);

        //Sets a click listener on the Album view.
        album_one.setOnClickListener(new View.OnClickListener() {
            /*   The code in this method will be executed when the album View is clicked on.
            Different albums have different views. Only one is shown here as an example.*/
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        //Finds the view that shows the contents of the Trending music.
        TextView trending = (TextView) findViewById(R.id.trending);

        //Sets a click listener on the Trending view.
        trending.setOnClickListener(new View.OnClickListener() {
            /*   The code in this method will be executed when the Trending Music View is
            clicked on.*/
            @Override
            public void onClick(View view) {
                Intent trendingIntent = new Intent(MainActivity.this, TrendingActivity.class);
                startActivity(trendingIntent);
            }
        });

        /*Finds the view that shows the contents of My favourites (could also be called
          recently played).**/
        TextView favourites = (TextView) findViewById(R.id.favourites);

        //Sets a click listener on the Favourites view.
        favourites.setOnClickListener(new View.OnClickListener() {
            //   The code in this method will be executed when My Favourites View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favouritesIntent = new Intent(MainActivity.this, FavouritesActivity.class);
                startActivity(favouritesIntent);
            }
        });

        //Finds the view that shows the Search results.
        TextView search = (TextView) findViewById(R.id.search);

        //Sets a click listener on the Search view.
        search.setOnClickListener(new View.OnClickListener() {
            //   The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchResultsActivity.class);
                startActivity(searchIntent);
            }
        });

    }
}
