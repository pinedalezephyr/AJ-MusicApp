package com.example.android.aj_musicapp;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    private ListView listView;

    private LibraryAdapter mAdapter;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_library);

        listView = (ListView) findViewById(R.id.song_list);

        ArrayList<Library> songlist = new ArrayList<>();

        songlist.add(new Library("ZZ Top","Waitin for the bus","      2:59"));

        songlist.add(new Library("ZZ Top","Master of Sparks","      3:33"));

        songlist.add(new Library("ZZ Top","Beer Drinkers","      3:23"));

        songlist.add(new Library("ZZ Top","how, blue and righteous","      3:14"));

        songlist.add(new Library("ZZ Top","Have you heard","      3:14"));

        songlist.add(new Library("ZZ Top","Jesus just left Chicago","      3:29"));

        songlist.add(new Library("ZZ Top","Move me down","      2:20"));

        songlist.add(new Library("ZZ Top","La Grange","      3:51"));

        songlist.add(new Library("ZZ Top","The Shiek","      4:04"));


        mAdapter = new LibraryAdapter(this,songlist);

        listView.setAdapter(mAdapter);

        // Find the View of button 8

            Button button8 = (Button) findViewById(R.id.button8);

    // Set a click listener on that View
            if (button8 != null) {
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });

            }
        }
    }