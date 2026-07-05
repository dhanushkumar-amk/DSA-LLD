package LLD.SOLID.L.BAD;

public class Duck extends Bird {

    // here duck can fly so no problem
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void eat() {
        super.eat();
    }
}