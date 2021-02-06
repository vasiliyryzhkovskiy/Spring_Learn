import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.MusicPlayer;

/**
 * Класс демонстрации работы spring с setter
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestMusicSetter {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // используем bean musicPlayerSetterBean
        MusicPlayer musicPlayer = context.getBean("musicPlayerSetterBean", MusicPlayer.class);

        musicPlayer.playMusic();

        // обязательно закрываем контекст
        context.close();
    }
}