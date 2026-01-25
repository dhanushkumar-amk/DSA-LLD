package LLD.OOPS;

public class ObjectCreation {
}

// Base class
 abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void stop() {
        System.out.println(name + " has stopped");
    }
}


// Interface for engine vehicles
interface EngineVehicle {
    void startEngine();
    void stopEngine();
    void refuel();
}

// Car1 class
 class Car1 extends Vehicle implements EngineVehicle {

    public Car1(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + " - Car1 engine started: Vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println(name + " - Car1 engine stopped");
    }

    @Override
    public void refuel() {
        System.out.println(name + " - Refueling car with petrol");
    }

    // Car1's own method
    public void openTrunk() {
        System.out.println(name + " - Trunk opened");
    }
}


