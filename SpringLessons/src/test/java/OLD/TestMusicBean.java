package OLD;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.MusicPlayer;

/**
 * С использованием spring bean - musicPlayerBean
 * создаём экземляр объекта MusicPlayer
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestMusicBean {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayer.playMusic();

        // обязательно закрываем контекст
        context.close();
    }

}
