package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.BAD;

public class NonVegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Pizza with chicken toppings");
    }
}