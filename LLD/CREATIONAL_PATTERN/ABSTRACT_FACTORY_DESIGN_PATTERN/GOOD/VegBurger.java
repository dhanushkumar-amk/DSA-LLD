package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.GOOD;

public class VegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger with veggie patty");
    }
}