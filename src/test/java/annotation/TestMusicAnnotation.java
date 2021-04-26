package annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vasiliyryzhkovskiy.springcourse.ElectroMusic;
import ru.vasiliyryzhkovskiy.springcourse.JazzMusic;

/**
 *
 */
public class TestMusicAnnotation {
    public static void main(String[] args) {
        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        ElectroMusic electroMusic = context.getBean("someElectroMusic", ElectroMusic.class);

        System.out.println(electroMusic.getSong());

        // обязательно закрываем контекст
        context.close();
    }

}
