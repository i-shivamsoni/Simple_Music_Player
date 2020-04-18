package com.example.simplemusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongDetailsAdapter extends ArrayAdapter<SongDetails> {


    public SongDetailsAdapter(@NonNull Context context, @NonNull ArrayList<SongDetails> song) {
        super(context, 0, song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_model_format, parent, false);
        }

        SongDetails currentWord = getItem(position);
        TextView songName = listItemView.findViewById(R.id.tv_songName);
        assert currentWord != null;
        songName.setText(currentWord.getSongName());
        TextView albumName = listItemView.findViewById(R.id.tv_albumName);
        albumName.setText(currentWord.getAlbumName());

        TextView artistName = listItemView.findViewById(R.id.tv_artistName);
        artistName.setText(currentWord.getArtistName());

        return listItemView;
    }


}
