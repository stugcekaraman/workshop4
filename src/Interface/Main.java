package Interface;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Daire Alanı: " + circle.calculateArea());
        System.out.println("Daire Çevresi: " + circle.calculatePerimeter());

        Square square = new Square(4);
        System.out.println("Kare Alanı: " + square.calculateArea());
        System.out.println("Kare Çevresi: " + square.calculatePerimeter());
    }
}
