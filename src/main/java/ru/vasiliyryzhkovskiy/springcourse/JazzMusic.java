package ru.vasiliyryzhkovskiy.springcourse;

/**
 *
 */
public class JazzMusic implements Music {

    private JazzMusic() {
    }

    public void doMyInit() {
        System.out.println("JazzMusic.class : Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("JazzMusic.class : Doing my destroying...");
    }

    @Override
    public String getSong() {
        return "JazzMusic - some song";
    }

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }
}
