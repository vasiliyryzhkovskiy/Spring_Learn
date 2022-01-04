package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.stereotype.Component;

/**
 * @author Vasiliy Ryzhkovskiy
 */

@Component
public class ClassicalMusicComponent implements MusicComponent {
    @Override
    public String getSong() {
        return "Chaikovskiy - Shelkunckik";
    }
}
