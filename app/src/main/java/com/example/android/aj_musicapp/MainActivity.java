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

    private ListView listView;

    private LibraryAdapter mAdapter;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.song_list);

        ArrayList<Library> songlist = new ArrayList<>();

        songlist.add(new Library("ZZ Top","Waitin for the bus","2:59"));

        songlist.add(new Library("ZZ Top","Master of Sparks","3:33"));

        songlist.add(new Library("ZZ Top","Beer Drinkers","3:23"));

        songlist.add(new Library("ZZ Top","how, blue and righteous","3:14"));

        songlist.add(new Library("ZZ Top","Have you heard","3:14"));

        songlist.add(new Library("ZZ Top","Jesus just left Chicago","3:29"));

        songlist.add(new Library("ZZ Top","Move me down the line","2:20"));

        songlist.add(new Library("ZZ Top","La Grange","3:51"));

        songlist.add(new Library("ZZ Top","The Shiek","4:04"));


        mAdapter = new LibraryAdapter(this,songlist);

        listView.setAdapter(mAdapter);


            // Set the content of the activity to use the activity_main.xml layout file
            setContentView(R.layout.activity_main);

            // Find the View that shows the numbers category

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
            // Find the View that shows the family category

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
            // Find the View that shows the colors category

            Button library = (Button) findViewById(R.id.library);

// Set a click listener on that View
            if (library != null) {
                library.setOnClickListener(new View.OnClickListener() {

// The code in this method will be executed when the colors View is clicked on.

                    @Override

                    public void onClick(View view) {

                        Intent libraryIntent = new Intent(MainActivity.this,Library.class);

                        startActivity(libraryIntent);

                    }

                });
                // Find the View that shows the phrases category

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
