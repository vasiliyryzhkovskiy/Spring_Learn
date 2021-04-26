import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.ClassicalMusic;

/**
 * показан процесс инициализации бина, работы и дестроя
 */
public class TestMusicBean2 {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        // показан процесс инициализации бина, работы и дестроя
        System.out.println(classicalMusic.getSong());

        // обязательно закрываем контекст
        context.close();
    }
}
