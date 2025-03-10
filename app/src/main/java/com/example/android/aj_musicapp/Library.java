package com.example.android.aj_musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library  {

            /** Song Title*/
            private String mTitle;

            /** Song Artist*/
            private String mArtist;

            /** length of sone*/
            private String mTime;

            /**
             * Constructs a new {@link Library} object.
             * @param Title is the name of song
             * @param Artist is the artist singing song
             * @param Time is the length of song
             * */
    public Library(String Artist, String Title, String Time){
               this.mTitle = Title;
                this.mArtist = Artist;
                this.mTime = Time;

            }
            /** returns the title of song
             */
            public String getmTitle() {return mTitle;}

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    /**     * returns the Artist of song
             */
            public String getmArtist() { return mArtist; }
     public void setmArtist (String mArtist) {
                this.mArtist = mArtist;
            }

            /** returns run time of song
             */
            public String getmTime() {return mTime;}

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }
}


