package LLD.CREATIONAL_PATTERN.FACTORY_DESIGN_PATTERN.GOOD;

public class FoodFactory {
    // ALL food-creation decision logic lives HERE, in one place
    public static Food createFood(String orderType) {
        switch (orderType.toUpperCase()) {
            case "PIZZA":
                return new Pizza();
            case "BURGER":
                return new Burger();
            case "PASTA":
                return new Pasta();
            default:
                throw new IllegalArgumentException("Item not on menu: " + orderType);
        }
    }
}