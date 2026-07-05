package LLD.CREATIONAL_PATTERN.BUILDER_DESIGN_PATTERN.GOOD;

public class Computer {
    // Required parts
    private final String cpu;
    private final String ram;

    // Optional parts
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasWifi;
    private final boolean hasBluetooth;

    // Private constructor - ONLY the Builder can create a Computer
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public void show() {
        System.out.println("Computer: CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
                ", GraphicsCard=" + hasGraphicsCard + ", WiFi=" + hasWifi + ", Bluetooth=" + hasBluetooth);
    }

    // 🔑 The Builder - constructs Computer step-by-step
    public static class Builder {
        private final String cpu;
        private final String ram;

        // Optional parts - sensible defaults
        private String storage = "256GB SSD";
        private boolean hasGraphicsCard = false;
        private boolean hasWifi = false;
        private boolean hasBluetooth = false;

        // Required parts go in the Builder's constructor
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this; // returning "this" allows CHAINING
        }

        public Builder addGraphicsCard(boolean value) {
            this.hasGraphicsCard = value;
            return this;
        }

        public Builder addWifi(boolean value) {
            this.hasWifi = value;
            return this;
        }

        public Builder addBluetooth(boolean value) {
            this.hasBluetooth = value;
            return this;
        }

        // Final step - actually builds the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}