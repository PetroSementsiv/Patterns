package StructuralPatterns.Adapter.Adapter;

import StructuralPatterns.Adapter.Adapter.IAdvancedMediaPlayer;

public class VlcPlayer implements IAdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("paying vlc file +" +fileName);
    }

    @Override
    public void playMp4(String fileName) {
//do nothing
    }
}
