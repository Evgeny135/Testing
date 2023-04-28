package org.example.track;

import org.example.track.Music;
import org.example.track.MusicStyles;

public class RockTrack extends Music {

    public RockTrack(String name, double duration) {
        super(name, duration, MusicStyles.ROCK);
    }

//    @Override
//    public void play() {
//        System.out.println("Играет рок");
//    }

}
