package LLD.SOLID.D.GOOD;

public class Bulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Bulb is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb is OFF");
    }
}