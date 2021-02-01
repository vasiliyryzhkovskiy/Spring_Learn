package ru.vasiliyryzhkovskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vasiliy Ryzhkovskiy
 */
public class TestMusicSpring {

    public static void main(String[] args) {

        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );

        // получаем bean c id="musicBean" для Music.class
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        // обязательно закрываем контекст
        context.close();
    }
}
