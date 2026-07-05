package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.BAD;

public class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza with paneer & veggies");
    }
}