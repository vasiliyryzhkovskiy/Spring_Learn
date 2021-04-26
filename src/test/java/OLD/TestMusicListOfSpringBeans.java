package OLD;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.MusicPlayer;

/**
 * Здесь показан пример из листа, содержащий spring bean
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestMusicListOfSpringBeans {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayerListsBean", MusicPlayer.class);

        musicPlayer.playMusicList();

        // обязательно закрываем контекст
        context.close();
    }
}
