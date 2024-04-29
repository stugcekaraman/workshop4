package Interface;

import java.awt.*;

class Square implements Shape {
    private double sideLength;

    // Kurucu metot
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Alan hesaplaması
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Çevre hesaplaması
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

}
