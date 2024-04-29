package Polimorfizm;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Truck();
        Car car3 = new Bus();

        car1.run();
        car2.run();
        car3.run();
    }
}
