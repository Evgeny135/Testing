package org.example;

public class MusicRunner {
    public static void main(String[] args) {
        Disc disc = new Disc();
        disc.addMusic(new PopTrack(2.4,"Take My Breath"));
        disc.addMusic(new PopTrack(3.4,"Not About Us"));
        disc.addMusic(new RockTrack("Беспечный ангел",4.8));
        disc.addMusic(new ElectronicTrack("Komarovo",3.8));


        disc.outputTracks();
        System.out.println();

        MusicProcessor.sortDisc(disc,MusicStyles.ELECTRONIC);
        System.out.println();

        disc.outputTracks();



    }
}
