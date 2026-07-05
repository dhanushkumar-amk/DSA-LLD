package LLD.SOLID.L.GOOD;

public class Main {
    static void main() {
        Duck duck = new Duck();
        duck.eat();
        duck.fly();


        Penguin penguin = new Penguin();
        penguin.eat();
        // penguin.fly() not even exits ok
    }
}
