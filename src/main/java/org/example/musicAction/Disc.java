package org.example.musicAction;

import org.example.track.Music;

import java.util.ArrayList;
import java.util.List;

public class Disc {
    private List<Music> musicList = new ArrayList<>();

    public void outputTracks(){
        for (Music music :
                musicList) {
            System.out.println(music);
        }
    }

    public double getTotalDuration(){
        double total = 0;
        for (Music music :
                musicList) {
            total+=music.getDuration();
        }
        return total;
    }

    public void addMusic(Music music){
        musicList.add(music);
    }

    public Disc() {
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "musicList=" + musicList +
                '}';
    }
}
