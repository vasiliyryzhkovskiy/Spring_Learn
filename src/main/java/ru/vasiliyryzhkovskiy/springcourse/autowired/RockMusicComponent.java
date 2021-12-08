package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.stereotype.Component;
import ru.vasiliyryzhkovskiy.springcourse.Music;

/**
 * @author Vasiliy Ryzhkovskiy
 */
@Component
public class RockMusicComponent implements Music {

    @Override
    public String getSong() {
        return "КиШ - Лесник";
    }
}
