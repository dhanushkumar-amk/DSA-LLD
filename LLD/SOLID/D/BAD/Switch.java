package LLD.SOLID.D.BAD;

public class Switch {
    // 🚨 PROBLEM: Switch (high-level/important) directly depends on Bulb (low-level/specific)
    private Bulb bulb = new Bulb();

    public void operate(boolean on) {
        if (on) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}