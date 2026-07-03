package OOPS.INTERFACES;

public class Main {
    static void main() {
        Car car = new Car();

        car.start();
        car.accelerate();
        car.stop();

        System.out.println(Car.price);
    }
}
