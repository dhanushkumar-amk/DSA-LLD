package LLD.DESIGN_PRINCIPLES.SOLID.L.GOOD;

// ✅ Car HAS engine - implements EngineVehicle
public class Car extends Vehicle implements EngineVehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + " - Car engine started: Vroom vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println(name + " - Car engine stopped");
    }

    @Override
    public void refuel() {
        System.out.println(name + " - Refueling car with petrol");
    }
}
