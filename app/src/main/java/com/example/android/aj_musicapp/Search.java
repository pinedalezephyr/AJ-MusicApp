package com.example.android.aj_musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Set the content of the activity to use the activity_search.xml layout file
        setContentView(R.layout.activity_search);

        // Find the View for button 7

        Button button6 = (Button) findViewById(R.id.button6);

// Set a click listener on that View
        if (button6 != null) {
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }
    }
}

