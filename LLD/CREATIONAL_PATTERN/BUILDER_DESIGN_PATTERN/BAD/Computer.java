package LLD.CREATIONAL_PATTERN.BUILDER_DESIGN_PATTERN.BAD;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private boolean hasGraphicsCard;
    private boolean hasWifi;
    private boolean hasBluetooth;

    // 🚨 Constructor keeps growing with every new optional part
    public Computer(String cpu, String ram, String storage, boolean hasGraphicsCard, boolean hasWifi, boolean hasBluetooth) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.hasGraphicsCard = hasGraphicsCard;
        this.hasWifi = hasWifi;
        this.hasBluetooth = hasBluetooth;
    }

    public void show() {
        System.out.println("Computer: CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
                ", GraphicsCard=" + hasGraphicsCard + ", WiFi=" + hasWifi + ", Bluetooth=" + hasBluetooth);
    }
}