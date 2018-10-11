package com.example.android.aj_musicapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;



/**

 * An {@link LibraryAdapter} knows how to create a list item layout for each songs
 * in the data source (a list of {@link Library} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class LibraryAdapter extends ArrayAdapter<Library>{
    /**
     * construct a new {@link LibraryAdapter}.
     *
     * @param context of the app
     * @param songs   is the list of songs in list
     *
     */
        private Context mContext;
        private ArrayList<Library> songsList = new ArrayList<>();

      public LibraryAdapter(@NonNull  Context context,List<Library> songsList) {
        super(context,0,songsList);
    }

    /**
     * Returns lise item view of songs at a given place in list of songs
     */
    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView, @Nullable ViewGroup parent) {
        // next checks for existing list in not null gets new list
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.library_list_item,parent,false);
        }
        // Find song  at position in list
        Library currentsong = songsList.get(position);
        // find Id Title
        TextView TitleView = (TextView) listItemView.findViewById(R.id.Title);
        // display song title for list
        TitleView.setText(currentsong.getmTitle());
        //Find Id for Atrist
         TextView ArtistView = (TextView) listItemView.findViewById(R.id.Artist);
        // display Artist
        ArtistView.setText(currentsong.getmArtist());
        //fid text view of time
        TextView TimeView = (TextView) listItemView.findViewById(R.id.Time);
        //display date for quake
        TimeView.setText(currentsong.getmTime());


        return listItemView;


    }

}

