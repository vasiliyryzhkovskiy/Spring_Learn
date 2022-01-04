package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vasiliy Ryzhkovskiy
 */

@Component
public class ClassicalMusicComponent implements MusicComponent {

    @PostConstruct
    public void init() {
        System.out.println("[ClassicalMusicComponent] initialization...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[ClassicalMusicComponent] destroing...");
    }

    @Override
    public String getSong() {
        return "Chaikovskiy - Shelkunckik";
    }
}
