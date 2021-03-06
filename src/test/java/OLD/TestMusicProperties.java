package OLD;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.MusicPlayer;

/**
 * Класс демонстрации работы spring с properties файлом
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestMusicProperties {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // используем bean musicPlayerSetterBean
        MusicPlayer musicPlayer = context.getBean("musicPlayerPropertyBean", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println("musicPlayer name = " + musicPlayer.getName());
        System.out.println("musicPlayer volume = " + musicPlayer.getVolume());

        // обязательно закрываем контекст
        context.close();
    }
}
