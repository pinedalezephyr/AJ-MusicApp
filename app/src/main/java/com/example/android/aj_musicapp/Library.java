package com.example.android.aj_musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_library);

            // Set the content of the activity to use the activity_library.xml layout file
            setContentView(R.layout.activity_library);

            // Find the View that shows the Returns to main screen category

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
