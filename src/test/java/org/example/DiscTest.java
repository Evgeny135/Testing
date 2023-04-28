package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
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
