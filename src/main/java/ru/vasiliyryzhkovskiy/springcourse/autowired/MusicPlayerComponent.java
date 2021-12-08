package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vasiliyryzhkovskiy.springcourse.Music;

/**
 * Такой же как и MusicPlayer, но для работы со Spring аннотацией @Autowired
 */
@Component
public class MusicPlayerComponent {
    private ClassicalMusicComponent classicalMusic;
    private RockMusicComponent rockMusic;

    // внедрение зависимости через поле
//    @Autowired
//    private Music music;

    // внедрение зависимости через конструктор
//    @Autowired
//    public MusicPlayerComponent(Music music) {
//      this.music = music;
//    }

    // внедрение зависимости через сеттер
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    @Autowired
    public MusicPlayerComponent(ClassicalMusicComponent classicalMusic, RockMusicComponent rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing : " + classicalMusic.getSong());
        System.out.println("Playing : " + rockMusic.getSong());
    }
}