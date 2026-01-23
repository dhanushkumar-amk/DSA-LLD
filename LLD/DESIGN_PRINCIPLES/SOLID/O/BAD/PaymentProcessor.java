package LLD.DESIGN_PRINCIPLES.SOLID.O.BAD;

// BAD: Adding new payment methods requires modifying this class
public class PaymentProcessor {

    public void processPayment(String paymentType, double amount) {

        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing Credit Card payment: $" + amount);
            System.out.println("Connecting to Credit Card gateway...");
            System.out.println("Payment successful!");

        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Processing PayPal payment: $" + amount);
            System.out.println("Redirecting to PayPal...");
            System.out.println("Payment successful!");

        } else if (paymentType.equals("BITCOIN")) {
            System.out.println("Processing Bitcoin payment: $" + amount);
            System.out.println("Connecting to blockchain...");
            System.out.println("Payment successful!");

        } else {
            System.out.println("Invalid payment type!");
        }
    }
}
