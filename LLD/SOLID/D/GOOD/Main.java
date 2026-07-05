package LLD.SOLID.D.GOOD;

public class Main {
    public static void main(String[] args) {
        Switch bulbSwitch = new Switch(new Bulb());
        bulbSwitch.operate(true);   // Bulb is ON

        Switch fanSwitch = new Switch(new Fan());
        fanSwitch.operate(true);    // Fan is ON
    }
}