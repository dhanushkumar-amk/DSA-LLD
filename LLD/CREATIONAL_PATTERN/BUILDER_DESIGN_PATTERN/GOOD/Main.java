package LLD.CREATIONAL_PATTERN.BUILDER_DESIGN_PATTERN.GOOD;

public class Main {
    public static void main(String[] args) {
        // ✅ Crystal clear - reads like a real spec sheet!
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .addGraphicsCard(true)
                .addWifi(true)
                .addBluetooth(true)
                .build();

        gamingPC.show();

        // A simpler office PC - just skip the parts you don't need
        Computer officePC = new Computer.Builder("Intel i5", "8GB")
                .addWifi(true)
                .build();

        officePC.show();


        Computer personalPC = new Computer.Builder("Intel 17", "32GB")
                .setStorage("100TB SSD")
                .addBluetooth(true)
                .addWifi(true)
                .addGraphicsCard(true)
                .build();

        personalPC.show();
    }
}