package ru.vasiliyryzhkovskiy.springcourse.autowired_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.vasiliyryzhkovskiy.springcourse.autowired.MusicComponent;

/**
 * Такой же как и MusicPlayer, но для работы со Spring аннотацией @Autowired
 */
@Component
public class MusicPlayerComponent {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

   // @Autowired
   // @Qualifier("classicalMusicComponent")
    private MusicComponent musicComponent1;
    private MusicComponent musicComponent2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayerComponent(@Qualifier("classicalMusicComponent") MusicComponent musicComponent1,
                                @Qualifier("rockMusicComponent") MusicComponent musicComponent2) {
        this.musicComponent1 = musicComponent1;
        this.musicComponent2 = musicComponent2;
    }

    public void playMusic() {
        System.out.println("Playing : " + musicComponent1.getSong() + ", " + musicComponent2.getSong());
    }

}