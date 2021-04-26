package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.ElectroMusic;
import ru.vasiliyryzhkovskiy.springcourse.HipHopMusic;

/**
 *
 */
public class TestMusicAnnotation {
    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        ElectroMusic electroMusic = context.getBean("ElectroMusicBean", ElectroMusic.class);
        HipHopMusic hipHopMusic = context.getBean("HipHopMusicBean", HipHopMusic.class);

        System.out.println(electroMusic.getSong());
        System.out.println(hipHopMusic.getSong());

        // обязательно закрываем контекст
        context.close();
    }

}
