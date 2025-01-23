package oop.CarConcern;

public class main {
    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("Aventador", 2022, "Red");
        CarConcern car2 = new CarConcern("Huracan", 2021);
        CarConcern car3 = new CarConcern("Urus");

        System.out.println("Car 1: " + car1.getManufacturer() + " " + car1.getModel() + ", " + car1.getYear() + ", " + car1.getColor());
        System.out.println("Car 2: " + car2.getManufacturer() + " " + car2.getModel() + ", " + car2.getYear() + ", " + car2.getColor());
        System.out.println("Car 3: " + car3.getManufacturer() + " " + car3.getModel() + ", " + car3.getYear() + ", " + car3.getColor());
    }
}

