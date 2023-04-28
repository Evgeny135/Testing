package org.example.musicAction;

import org.example.musicAction.Disc;
import org.example.track.ElectronicTrack;
import org.example.track.Music;
import org.example.track.PopTrack;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiscTest {

    private Disc disc =new Disc();

    @Mock
    private ElectronicTrack electronicTrack = new ElectronicTrack("Sorry",2.5);



    @Mock
    private PopTrack popTrack = new PopTrack(3.5,"NewEra");


    @Test
    void addTwoMusicInDiscSizeShouldEqualTwo(){
        //arrange
        disc.addMusic(electronicTrack);
        disc.addMusic(popTrack);

        //act
        List<Music> musicList = disc.getMusicList();

        //assert
        assertEquals(2,musicList.size());
        assertEquals(electronicTrack,musicList.get(0));
        assertEquals(popTrack,musicList.get(1));
    }

    @Test
    void getTotalDurationShouldEqualsSix() {
        disc.addMusic(electronicTrack);
        disc.addMusic(popTrack);

        //act
        double totalDuration = disc.getTotalDuration();

        assertEquals(6.0, totalDuration);
    }

}
