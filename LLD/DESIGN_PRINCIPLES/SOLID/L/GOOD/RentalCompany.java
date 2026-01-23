package LLD.DESIGN_PRINCIPLES.SOLID.L.GOOD;

public class RentalCompany {

    // ✅ Method for ALL vehicles (only uses common behavior)
    public void trackVehicle(Vehicle vehicle) {
        System.out.println("\n--- Tracking " + vehicle.name + " ---");
        vehicle.move();
        vehicle.stop();
    }

    // ✅ Method ONLY for engine vehicles
    public void rentEngineVehicle(EngineVehicle engineVehicle) {
        System.out.println("\n--- Renting Engine Vehicle ---");
        engineVehicle.startEngine();
        engineVehicle.refuel();
        engineVehicle.stopEngine();
    }

    // ✅ Method for bicycles
    public void rentBicycle(Bicycle bicycle) {
        System.out.println("\n--- Renting Bicycle ---");
        bicycle.pedal();
        bicycle.ringBell();
    }

    public static void main(String[] args) {
        RentalCompany company = new RentalCompany();

        // Create vehicles
        Car car = new Car("Toyota");
        Motorcycle motorcycle = new Motorcycle("Harley");
        Bicycle bicycle = new Bicycle("BMX");
        ElectricBicycle eBike = new ElectricBicycle("Tesla Bike");

        System.out.println("=== TRACKING ALL VEHICLES ===");
        // ✅ Works for ALL vehicles - LSP satisfied!
        company.trackVehicle(car);
        company.trackVehicle(motorcycle);
        company.trackVehicle(bicycle);
        company.trackVehicle(eBike);

        System.out.println("\n=== RENTING ENGINE VEHICLES ===");
        // ✅ Works ONLY for engine vehicles
        company.rentEngineVehicle(car);
        company.rentEngineVehicle(motorcycle);
        // company.rentEngineVehicle(bicycle);  // ❌ Won't compile! Type safety!

        System.out.println("\n=== RENTING BICYCLES ===");
        // ✅ Works for bicycles
        company.rentBicycle(bicycle);

        System.out.println("\n=== ELECTRIC BICYCLE ===");
        // ✅ Electric bicycle has unique methods
        eBike.chargeBattery();
        eBike.turnOnMotor();
        eBike.move();
    }
}
