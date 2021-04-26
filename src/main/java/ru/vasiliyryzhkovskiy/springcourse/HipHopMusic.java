package ru.vasiliyryzhkovskiy.springcourse;

import org.springframework.stereotype.Component;

/**
 *
 */

@Component("HipHopMusicBean")
public class HipHopMusic implements Music {

    @Override
    public String getSong() {
        return "HipHopMusic - some song";
    }

    public void doMyInit() {
        System.out.println("HipHopMusic.class : Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("HipHopMusic.class : Doing my destroying...");
    }
}
