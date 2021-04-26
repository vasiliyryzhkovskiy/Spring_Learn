package ru.vasiliyryzhkovskiy.springcourse;

/**
 * @author Vasiliy Ryzhkovskiy
 */
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Chaikovskiy - Shelkunckik";
    }

    public void doMyInit() {
        System.out.println("ClassicalMusic.class : Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("ClassicalMusic.class : Doing my destroying...");
    }
}
