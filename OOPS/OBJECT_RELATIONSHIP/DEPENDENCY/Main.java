package OOPS.OBJECT_RELATIONSHIP.DEPENDENCY;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Laptop", 55000);

        // PaymentGateway created just for this one call - not stored anywhere in Order
        PaymentGateway gateway = new PaymentGateway();
        order1.checkout(gateway);

        // We could even use a DIFFERENT gateway for a different order - total flexibility
        Order order2 = new Order("Headphones", 2000);
        order2.checkout(new PaymentGateway());
    }
}