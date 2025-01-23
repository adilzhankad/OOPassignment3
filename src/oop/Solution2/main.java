package oop.Solution2;


public class main {
    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        City dubai = new City("Aстана", 40);
        showWeather(dubai);
    }
}
