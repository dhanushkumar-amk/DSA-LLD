package LLD.DESIGN_PRINCIPLES.SOLID.L.BAD;

public class Motorcycle extends Vehicle{
    public Motorcycle(String name) {
        super(name);
    }

    // Motorcycle can use all parent methods safely
    @Override
    public void move() {
        super.move();
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void refuel() {
        super.refuel();
    }
}
