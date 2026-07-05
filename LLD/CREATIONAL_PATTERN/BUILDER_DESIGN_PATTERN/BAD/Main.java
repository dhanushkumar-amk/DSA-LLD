package LLD.CREATIONAL_PATTERN.BUILDER_DESIGN_PATTERN.BAD;

public class Main {
    public static void main(String[] args) {
        // 🚨 What does true, false, true even mean here?! Unreadable.
        Computer pc = new Computer("Intel i7", "16GB", "512GB SSD", true, false, true);
        pc.show();
    }
}