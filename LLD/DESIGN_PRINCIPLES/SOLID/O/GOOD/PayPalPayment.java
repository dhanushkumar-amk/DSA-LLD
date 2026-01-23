package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class PayPalPayment implements  PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
        System.out.println("Redirecting to PayPal...");
        System.out.println("Payment successful!");
    }
}
