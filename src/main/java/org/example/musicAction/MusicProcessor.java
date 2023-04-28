package org.example.musicAction;

import org.example.track.Music;
import org.example.track.MusicStyles;

import java.util.ArrayList;
import java.util.List;

public class MusicProcessor {
    public static List<Music> sortDisc(Disc disc, MusicStyles musicStyles){
        List<Music> sortedList = new ArrayList<>(disc.getMusicList());
        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = 0; j < sortedList.size()-1; j++) {
                if (!sortedList.get(j).getMusicStyles().equals(musicStyles) && sortedList.get(j+1).getMusicStyles().equals(musicStyles)){
                    Music music = sortedList.get(j);
                    sortedList.set(j,disc.getMusicList().get(j+1));
                    sortedList.set(j+1,music);
                }
            }
        }
        return sortedList;
    }
    public static List<Music> findByRange(Disc disc,double min,double max){
        List<Music> list = new ArrayList<>();
        disc.getMusicList().stream().filter(music -> music.getDuration()>=min && music.getDuration()<=max).forEach(music -> list.add(music));
        return list;
    }

}
