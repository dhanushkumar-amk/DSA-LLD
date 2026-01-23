package LLD.DESIGN_PRINCIPLES.SOLID.L.BAD;

public class RentalCompany {

    // This method expects ALL vehicles can start engine
    public void rentVehicle(Vehicle vehicle) {
        System.out.println("\n--- Renting " + vehicle.name + " ---");
        vehicle.startEngine();  // ❌ CRASH if vehicle is Bicycle!
        vehicle.move();
        vehicle.refuel();       // ❌ CRASH if vehicle is Bicycle!
        vehicle.stopEngine();   // ❌ CRASH if vehicle is Bicycle!
    }

    public static void main(String[] args) {
        RentalCompany company = new RentalCompany();

        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Harley");
        Vehicle bicycle = new Bicycle("BMX");

        company.rentVehicle(car);        // ✅ Works fine
        company.rentVehicle(motorcycle); // ✅ Works fine
        company.rentVehicle(bicycle);    // ❌ CRASH! Multiple exceptions!
    }
}
