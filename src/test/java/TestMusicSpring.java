import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.Music;
import ru.vasiliyryzhkovskiy.springcourse.MusicPlayer;

/**
 * С использованием конструкции new создаём экземляр объекта MusicPlayer
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestMusicSpring {

    public static void main(String[] args) {

        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // получаем bean c id="musicBean" для Music.class
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        // обязательно закрываем контекст
        context.close();
    }
}
