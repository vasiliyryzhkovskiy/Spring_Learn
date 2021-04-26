package ru.vasiliyryzhkovskiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Такой же как и MusicPlayer, но для работы со Spring аннотацией @Autowired
 */
@Component
public class NewMusicPlayer {
    private Music music;

    /**
     * для IoC
     */
    @Autowired
    public NewMusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing : " + music.getSong());
    }

}
