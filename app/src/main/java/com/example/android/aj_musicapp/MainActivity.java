package com.example.android.aj_musicapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Movie;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            // Set the content of the activity to use the activity_main.xml layout file
            setContentView(R.layout.activity_main);

            // Find the button to play the song

            Button playsongs = (Button) findViewById(R.id.playsongs);

// Set a click listener on that View
            if (playsongs != null) {
                playsongs.setOnClickListener(new View.OnClickListener() {

// The code in this method will be executed when the numbers View is clicked on.

                    @Override

                    public void onClick(View view) {

                        Intent playsongsIntent = new Intent(MainActivity.this,PlaySongs.class);

                        startActivity(playsongsIntent);

                    }

                });

            }
            // Find the button that opens the search page

            Button search = (Button) findViewById(R.id.search);

// Set a click listener on that View
            if (search != null) {
                search.setOnClickListener(new View.OnClickListener() {

// The code in this method will be executed when the family View is clicked on.

                    @Override

                    public void onClick(View view) {

                        Intent searchIntent = new Intent(MainActivity.this,Search.class);

                        startActivity(searchIntent);

                    }

                });

            }
            // Find the button that opens the Library page

            Button library = (Button) findViewById(R.id.library);

// Set a click listener on that View
            if (library != null) {
                library.setOnClickListener(new View.OnClickListener() {

// The code in this method will be executed when the colors View is clicked on.

                    @Override

                    public void onClick(View view) {
                        Intent libraryIntent = new Intent(MainActivity.this,LibraryActivity.class);
                        startActivity(libraryIntent);

                    }

                });
                // Find the button that will open the online guide when hooked up

                Button online = (Button) findViewById(R.id.online);
// Set a click listener on that View
                if (online != null) {
                    online.setOnClickListener(new View.OnClickListener() {

// The code in this method will be executed when the phrases View is clicked on.

                        @Override

                        public void onClick(View view) {
                            Intent onlineIntent = new Intent(MainActivity.this,Online.class);
                            startActivity(onlineIntent);

                        }

                    });

                }

            }
        }
    }
