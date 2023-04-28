package org.example.track;

public class ElectronicTrack extends Music {
    public ElectronicTrack(String name, double duration) {
        super(name, duration, MusicStyles.ELECTRONIC);
    }

//    @Override
//    public void play() {
//        System.out.println("Играет электронная музыка");
//    }
}
