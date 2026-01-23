package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class BitcoinPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment: $" + amount);
        System.out.println("Connecting to blockchain...");
        System.out.println("Payment successful!");
    }
}
