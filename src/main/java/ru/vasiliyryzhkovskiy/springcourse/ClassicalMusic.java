package ru.vasiliyryzhkovskiy.springcourse;

/**
 * @author Vasiliy Ryzhkovskiy
 */
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Chaikovskiy - Shelkunckik";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroying...");
    }
}
