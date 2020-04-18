package com.example.simplemusic;

public class SongDetails {
    private String songName, artistName, albumName;

    public SongDetails(String songName, String artistName, String albumName) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }
}
