package oop.car;

import java.util.Objects;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
