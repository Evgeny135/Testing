package org.example.track;

public enum MusicStyles {
    POP("поп"),
    ROCK("рок"),
    ELECTRONIC("электроника");

    private String genre;


    MusicStyles(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
