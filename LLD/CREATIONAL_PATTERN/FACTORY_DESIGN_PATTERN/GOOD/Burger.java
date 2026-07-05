package LLD.CREATIONAL_PATTERN.FACTORY_DESIGN_PATTERN.GOOD;

public class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Burger: bun, patty, veggies, sauce");
    }
}