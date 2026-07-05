package LLD.SOLID.D.GOOD;

public class Switch {
    // ✅ Switch now depends on the ABSTRACTION, not a specific device
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}