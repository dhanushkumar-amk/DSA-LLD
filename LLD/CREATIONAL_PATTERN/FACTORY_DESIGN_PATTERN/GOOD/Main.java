package LLD.CREATIONAL_PATTERN.FACTORY_DESIGN_PATTERN.GOOD;

public class Main {
    static void main() {
        Food order1 = FoodFactory.createFood("PIZZA");
        order1.prepare();

        Food order2 = FoodFactory.createFood("BURGER");
        order2.prepare();

        Food order3 = FoodFactory.createFood("PASTA");
        order3.prepare();
    }
}
