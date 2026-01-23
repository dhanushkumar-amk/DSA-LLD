package LLD.DESIGN_PRINCIPLES.SOLID.L.BAD;

public class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // All vehicles can move
    public void move() {
        System.out.println(name + " is moving");
    }

    // ❌ PROBLEM: Assumes ALL vehicles have engines!
    public void startEngine() {
        System.out.println(name + " - Engine started: Vroom vroom!");
    }

    public void stopEngine() {
        System.out.println(name + " - Engine stopped");
    }

    public void refuel() {
        System.out.println(name + " - Refueling with petrol");
    }
}
