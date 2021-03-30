import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.MusicPlayer;

/**
 * Класс демонстрации работы spring со Scope (Область видимости бинов)
 */
public class TestMusicScopeBean {
    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // используем bean musicPlayerScopeBean
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerScopeBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerScopeBean", MusicPlayer.class);

        boolean compare = firstMusicPlayer == secondMusicPlayer;

        System.out.println( "compare beans = " + compare);
        System.out.println( "firstMusicPlayer = " + firstMusicPlayer);
        System.out.println( "secondMusicPlayer = " + secondMusicPlayer);

        System.out.println( "firstMusicPlayer volume before = " + firstMusicPlayer.getVolume());
        System.out.println( "secondMusicPlayer volume before= " + secondMusicPlayer.getVolume());

        System.out.println( "change volume value for firstMusicPlayer to 10 " );
        firstMusicPlayer.setVolume(10);

        System.out.println( "firstMusicPlayer volume = " + firstMusicPlayer.getVolume());
        System.out.println( "secondMusicPlayer volume = " + secondMusicPlayer.getVolume());

        // обязательно закрываем контекст
        context.close();
    }
}