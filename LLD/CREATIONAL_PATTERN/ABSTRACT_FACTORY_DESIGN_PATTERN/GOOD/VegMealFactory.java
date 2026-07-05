package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.GOOD;

public class VegMealFactory implements MealFactory {
    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }

    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}