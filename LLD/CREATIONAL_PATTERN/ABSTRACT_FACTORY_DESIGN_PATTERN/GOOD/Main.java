package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.GOOD;

public class Main {
    public static void main(String[] args) {
        // ✅ Pick ONE factory - it guarantees a MATCHING, consistent family
        MealFactory vegFactory = new VegMealFactory();
        Pizza vegPizza = vegFactory.createPizza();
        Burger vegBurger = vegFactory.createBurger();
        vegPizza.prepare();
        vegBurger.prepare();

        System.out.println();

        MealFactory nonVegFactory = new NonVegMealFactory();
        Pizza nonVegPizza = nonVegFactory.createPizza();
        Burger nonVegBurger = nonVegFactory.createBurger();
        nonVegPizza.prepare();
        nonVegBurger.prepare();

        // 🎉 It's now IMPOSSIBLE to accidentally mix a VegPizza with a NonVegBurger -
        // whichever factory you pick, EVERYTHING it creates belongs to that SAME family
    }
}