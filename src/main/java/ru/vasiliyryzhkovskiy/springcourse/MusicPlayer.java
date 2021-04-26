package ru.vasiliyryzhkovskiy.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vasiliy Ryzhkovskiy
 */
public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    /**
     * название музыкального плеера
     */
    private String name;

    /**
     * уровень громкости плеера
     */
    private int volume;

    /**
     * def constructor need for spring bean musicPlayerSetterBean
     *
     * @see /src/main/resources/applicationContext.xml
     */
    public MusicPlayer() {
    }

    // для IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // для возможности использования spring данного setter
    public void setMusic(Music music) {
        this.music = music;
//        System.out.println("yes yes it is  " + MusicPlayer.class.getSimpleName()) ;
    }

    public void playMusic() {
        System.out.println("Playing : " + music.getSong());
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getClass().getSimpleName() + " : " + music.getSong());
        }
    }

}