package LLD.DESIGN_PRINCIPLES.SOLID.L.GOOD;

// ✅ BONUS: Electric bicycle - different fuel type
public class ElectricBicycle extends Vehicle {

    public ElectricBicycle(String name) {
        super(name);
    }

    public void chargeBattery() {
        System.out.println(name + " - Charging battery");
    }

    public void turnOnMotor() {
        System.out.println(name + " - Electric motor ON");
    }
}