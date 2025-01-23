package oop.market;

public class market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean localHasEggs = false;
        main.makePurchases(localHasEggs); // Вызов метода из класса Main
    }
}
