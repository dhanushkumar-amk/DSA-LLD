package LLD.CREATIONAL_PATTERN.FACTORY_DESIGN_PATTERN.BAD;

public class Main {
    public static void main(String[] args) {
        String order = "PIZZA";

        // 🚨 PROBLEM: creation logic (if-else) sits directly in client code
        Food food;
        if (order.equals("PIZZA")) {
            food = new Pizza();
        } else if (order.equals("BURGER")) {
            food = new Burger();
        } else if (order.equals("PASTA")) {
            food = new Pasta();
        } else {
            throw new IllegalArgumentException("Item not on menu!");
        }

        food.prepare();

        // 🚨 This SAME if-else block gets repeated everywhere
        // an order needs to be placed - in the app, the website, the kiosk, etc.
    }
}


/*
*  Every place in the app that takes an order has to repeat this same if-else chain.
* Add a new dish? You now hunt down and update EVERY one of those places.
*/
