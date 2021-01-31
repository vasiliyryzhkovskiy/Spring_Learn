package ru.vasiliyryzhkovskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Класс демонстрации работы spring bean
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestSpring {
    public static void main(String[] args) {

        // создаём переменную spring контекста, которая читает файл applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );

        // получаем bean c id="testBean" для TestBean.class
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println("Значение testBean.getName() = " + testBean.getName());

        // обязательно закрываем контекст
        context.close();
    }
}
