package inter_face;

import java.awt.*; //Abstract Window Toolkit подключает все классы

public class Task17 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }
    public interface Animal {
        Color getColor();
    }
    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
        @Override
        public abstract Color getColor();
    }
    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.ORANGE;
        }
    }
}