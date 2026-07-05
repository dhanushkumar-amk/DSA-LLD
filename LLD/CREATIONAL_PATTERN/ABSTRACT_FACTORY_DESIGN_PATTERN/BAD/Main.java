package LLD.CREATIONAL_PATTERN.ABSTRACT_FACTORY_DESIGN_PATTERN.BAD;

public class Main {
    public static void main(String[] args) {
        // 🚨 PROBLEM: nothing stops you from accidentally mixing families!
        Pizza pizza = new VegPizza();
        Burger burger = new NonVegBurger(); // 🚨 Oops - mixed a veg pizza with a non-veg burger!

        pizza.prepare();
        burger.prepare();
    }
}
