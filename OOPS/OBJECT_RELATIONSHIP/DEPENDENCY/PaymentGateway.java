package OOPS.OBJECT_RELATIONSHIP.DEPENDENCY;

public class PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via gateway...");
    }

    public void postProcessPayment(double amount){
        System.out.println("Payment completed of ₹" + amount);
    }
}