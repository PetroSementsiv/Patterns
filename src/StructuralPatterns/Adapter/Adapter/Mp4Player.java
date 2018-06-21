package StructuralPatterns.Adapter.Adapter;

import StructuralPatterns.Adapter.Adapter.IAdvancedMediaPlayer;

public class Mp4Player implements IAdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 filename + " + fileName);
    }
}
