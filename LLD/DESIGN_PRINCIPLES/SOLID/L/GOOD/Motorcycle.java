package LLD.DESIGN_PRINCIPLES.SOLID.L.GOOD;

// ✅ Motorcycle HAS engine - implements EngineVehicle
public class Motorcycle extends Vehicle implements EngineVehicle {

    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + " - Motorcycle engine started: Brrrr!");
    }

    @Override
    public void stopEngine() {
        System.out.println(name + " - Motorcycle engine stopped");
    }

    @Override
    public void refuel() {
        System.out.println(name + " - Refueling motorcycle with petrol");
    }
}