package LLD.DESIGN_PRINCIPLES.SOLID.L.GOOD;

// ✅ Bicycle has NO engine - does NOT implement EngineVehicle
public class Bicycle extends Vehicle {

    public Bicycle(String name) {
        super(name);
    }

    // Bicycle has its own unique behavior
    public void pedal() {
        System.out.println(name + " - Pedaling the bicycle");
    }

    public void ringBell() {
        System.out.println(name + " - Ring ring!");
    }
}