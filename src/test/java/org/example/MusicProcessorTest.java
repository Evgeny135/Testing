package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MusicProcessorTest {
    @InjectMocks
    private Disc disc;

    @Mock
    private ElectronicTrack electronicTrack = new ElectronicTrack("Faded",5.0);

    @Mock
    private PopTrack popTrack = new PopTrack(2.0,"Weeknd");

    @Mock
    private ElectronicTrack electronicTrack1 = new ElectronicTrack("Alone",3.0);

    @Mock
    List<Music> mockMusicList;

    @BeforeEach
    public void setup() {
        //if we don't call below, we will get NullPointerException
        MockitoAnnotations.initMocks(this);


    }

    @Test
    void sortDisc() {
        //arrange

        Mockito.when(mockMusicList.get(0)).thenReturn(electronicTrack);
        Mockito.when(mockMusicList.get(1)).thenReturn(popTrack);
        Mockito.when(mockMusicList.get(2)).thenReturn(electronicTrack1);

        //Mockito.when(disc.getMusicList()).thenReturn(mockMusicList);

        List<Music> rightMusicList = new ArrayList<>();
        rightMusicList.add(electronicTrack);
        rightMusicList.add(electronicTrack1);
        rightMusicList.add(popTrack);

        //act
        List<Music> actual = MusicProcessor.sortDisc(disc, MusicStyles.ELECTRONIC);

        //assert
        assertEquals(rightMusicList, actual);
    }

//    @Test
//    void findByRange() {
//        disc.addMusic(popTrack);
//        disc.addMusic(electronicTrack);
//        disc.addMusic(electronicTrack1);
//
//        List<Music> musicList = new ArrayList<>();
//        musicList.add(electronicTrack);
//        musicList.add(electronicTrack1);
//
//        assertEquals(popTrack,MusicProcessor.findByRange(disc,1.5,2.5).get(0));
//        assertEquals(1,MusicProcessor.findByRange(disc,1.5,2.5).size());
//        assertEquals(musicList,MusicProcessor.findByRange(disc,2.5,6.0));
//    }
}