package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vasiliyryzhkovskiy.springcourse.Music;

/**
 * Такой же как и MusicPlayer, но для работы со Spring аннотацией @Autowired
 */
@Component
public class MusicPlayerComponent {
    private Music music;

    @Autowired
    public MusicPlayerComponent(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing : " + music.getSong());
    }

}
