package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class GooglePayPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Google Pay payment: $" + amount);
        System.out.println("Connecting to Google Pay API...");
        System.out.println("Payment successful!");
    }
}
