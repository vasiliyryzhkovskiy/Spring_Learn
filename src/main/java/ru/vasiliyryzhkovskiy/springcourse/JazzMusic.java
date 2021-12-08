package ru.vasiliyryzhkovskiy.springcourse;

/**
 *
 */
public class JazzMusic implements Music {

    private JazzMusic() {
    }

    @Override
    public String getSong() {
        return "JazzMusic - some song";
    }

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }
}
