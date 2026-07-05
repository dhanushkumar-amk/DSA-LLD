package LLD.CREATIONAL_PATTERN.FACTORY_DESIGN_PATTERN.GOOD;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza: base, sauce, cheese, toppings, bake");
    }
}