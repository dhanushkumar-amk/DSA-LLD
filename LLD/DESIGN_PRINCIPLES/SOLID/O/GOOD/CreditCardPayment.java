package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment: $" + amount);
        System.out.println("Connecting to Credit Card gateway...");
        System.out.println("Payment successful!");
    }
}
