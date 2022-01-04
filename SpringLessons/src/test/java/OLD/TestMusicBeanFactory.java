package OLD;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.JazzMusic;

/**
 *
 */
public class TestMusicBeanFactory {

    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JazzMusic jazzMusic = context.getBean("jazzBeanFactory", JazzMusic.class);

        System.out.println(jazzMusic.getSong());

        // обязательно закрываем контекст
        context.close();
    }
}
