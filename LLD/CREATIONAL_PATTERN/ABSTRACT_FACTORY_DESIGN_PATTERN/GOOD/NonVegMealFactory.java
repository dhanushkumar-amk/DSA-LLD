package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.GOOD;

public class NonVegMealFactory implements MealFactory {
    @Override
    public Pizza createPizza() {
        return new NonVegPizza();
    }

    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
}