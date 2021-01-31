package ru.vasiliyryzhkovskiy.springcourse;

/**
 * Класс для инициализации spring bean
 *
 * @author Vasiliy Ryzhkovskiy
 */
public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
