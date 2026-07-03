package OOPS.OBJECT_RELATIONSHIP.DEPENDENCY;

public class Order {
    private String itemName;
    private double amount;

    public Order(String itemName, double amount) {
        this.itemName = itemName;
        this.amount = amount;
    }

    // NOTICE: PaymentGateway is NOT a field in this class!
    // It only appears as a method parameter - used temporarily, then discarded
    public void checkout(PaymentGateway gateway) {
        System.out.println("Checking out: " + itemName);
        gateway.processPayment(amount); // used here, and only here
        gateway.postProcessPayment(amount); // used here, and only here
        System.out.println("Order placed successfully!\n");

    }
}