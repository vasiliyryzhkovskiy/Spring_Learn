package ru.vasiliyryzhkovskiy.springcourse.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Проверка Autowired
 */
public class TestSpringComponent {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        MusicPlayerComponent musicPlayer = context.getBean("musicPlayerComponent", MusicPlayerComponent.class);

        musicPlayer.playMusic();

        // обязательно закрываем контекст
        context.close();
    }
}
