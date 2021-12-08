package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.stereotype.Component;
import ru.vasiliyryzhkovskiy.springcourse.Music;

/**
 * @author Vasiliy Ryzhkovskiy
 */
public class ClassicalMusicComponent implements Music {
    @Override
    public String getSong() {
        return "Chaikovskiy - Shelkunckik";
    }
}
