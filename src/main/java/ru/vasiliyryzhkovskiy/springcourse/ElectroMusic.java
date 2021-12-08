package ru.vasiliyryzhkovskiy.springcourse;

public class ElectroMusic implements Music {
    @Override
    public String getSong() {
        return "ElectroMusic - some song";
    }

    public void doMyInit() {
        System.out.println("ElectroMusic.class : Doing my initialization...");
    }

    public void doMyDestroy() {
        System.out.println("ElectroMusic.class : Doing my destroying...");
    }
}
