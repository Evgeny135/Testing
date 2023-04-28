package org.example;

public abstract class Music {
    private String name;
    private double duration;
    private MusicStyles musicStyles;

    public Music(String name, double duration, MusicStyles musicStyles) {
        this.name = name;
        this.duration = duration;
        this.musicStyles = musicStyles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public MusicStyles getMusicStyles() {
        return musicStyles;
    }
    public void play(){
        System.out.println("Играет " + this.musicStyles);
    };

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", musicStyles=" + musicStyles +
                '}';
    }
}
