package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.GOOD;

public class NonVegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Burger with chicken patty");
    }
}