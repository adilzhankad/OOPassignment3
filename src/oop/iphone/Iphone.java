package oop.iphone;


public class Iphone {
    private String model;
    private String color;
    private int price;
    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Iphone))
            return false;

        Iphone second = (Iphone) obj;

        return this.model == second.model && this.color == second.color && this.price ==second.price;
    }


}