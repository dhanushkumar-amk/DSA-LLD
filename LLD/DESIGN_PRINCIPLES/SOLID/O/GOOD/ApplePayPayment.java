package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class ApplePayPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Apple Pay payment: $" + amount);
        System.out.println("Connecting to Apple Pay API...");
        System.out.println("Payment successful!");
    }
}
