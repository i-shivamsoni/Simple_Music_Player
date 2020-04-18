package com.example.simplemusic;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);


        ArrayList<SongDetails> songs = new ArrayList<SongDetails>();
        songs.add(new SongDetails("Without Me", "Hasley", "Without Me"));
        songs.add(new SongDetails("Darkside", "Alan Walker & more", "Darkside"));
        songs.add(new SongDetails("Shape Of You", "Ed Shreen", "Shape Of You"));
        songs.add(new SongDetails("Senorita", "Shawn Mendes", "Senorita"));
        songs.add(new SongDetails("Sorry", "Justin Biber", "Purpose"));
        songs.add(new SongDetails("Love Yourself", "Justin Biber", "Purpose"));
        songs.add(new SongDetails("On My Way", "Alan Walker & more", "On My Way"));
        songs.add(new SongDetails("Cheap Thrills", "Sia, Sean Paul", "Cheap Thrills"));
        songs.add(new SongDetails("Attention", "Charlie Puth", "Attension"));
        songs.add(new SongDetails("Magenta Riddim", "DJ Snake", "Magenta Riddim"));
        songs.add(new SongDetails("Friends", "Marshmallow", "Friends"));
        songs.add(new SongDetails("Thunder", "Imagine Dragons", "Envole"));
        songs.add(new SongDetails("Believer", "Imagine Dragons", "Envole"));
        songs.add(new SongDetails("Nikle Current", "Jassi Gill", "Nikle Current"));
        songs.add(new SongDetails("Control", "Armaan Malik", "Control"));

        SongDetailsAdapter adapter = new SongDetailsAdapter(this, songs);

        ListView listView = findViewById(R.id.n_list);

        assert listView != null;
        listView.setAdapter(adapter);
    }
}
