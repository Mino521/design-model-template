package StructuralPatterns.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: "+filename);
    }

    @Override
    public void playMP4(String filename) {

    }
}
