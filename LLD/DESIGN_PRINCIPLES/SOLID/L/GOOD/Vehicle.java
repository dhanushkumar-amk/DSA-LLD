package LLD.DESIGN_PRINCIPLES.SOLID.L.GOOD;

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // ✅ ALL vehicles can move - safe to keep here
    public void move() {
        System.out.println(name + " is moving");
    }

    // ✅ ALL vehicles can stop - safe to keep here
    public void stop() {
        System.out.println(name + " has stopped");
    }
}
