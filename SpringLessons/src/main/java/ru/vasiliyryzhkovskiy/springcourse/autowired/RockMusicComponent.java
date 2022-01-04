package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.stereotype.Component;

/**
 * @author Vasiliy Ryzhkovskiy
 */
@Component
public class RockMusicComponent implements MusicComponent {

    @Override
    public String getSong() {
        return "КиШ - Лесник";
    }
}
