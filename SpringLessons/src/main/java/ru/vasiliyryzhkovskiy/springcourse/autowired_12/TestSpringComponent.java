package ru.vasiliyryzhkovskiy.springcourse.autowired_12;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.autowired.ClassicalMusicComponent;

/**
 * Проверка Autowired
 */
public class TestSpringComponent {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContextAnnotation.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotationTwelve.xml");

        MusicPlayerComponent musicPlayerComponent = context.getBean("musicPlayerComponent", MusicPlayerComponent.class);

        System.out.println(musicPlayerComponent.getName());
        System.out.println(musicPlayerComponent.getVolume());

        ClassicalMusicComponent classicalMusicComponent = context.getBean("classicalMusicComponent", ClassicalMusicComponent.class);

        // обязательно закрываем контекст
        context.close();
    }
}
