package sja;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Проверка c SpringConfig.class
 */
public class TestSpring {

    public static void main(String[] args) {
        // создаём переменную spring контекста из SpringConfig класса
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        musicPlayer.playMusic();

        // обязательно закрываем контекст
        context.close();
    }
}
