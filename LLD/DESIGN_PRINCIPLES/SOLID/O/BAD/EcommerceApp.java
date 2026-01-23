package LLD.DESIGN_PRINCIPLES.SOLID.O.BAD;

public class EcommerceApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CREDIT_CARD", 100.0);
        processor.processPayment("PAYPAL", 200.0);
        processor.processPayment("BITCOIN", 300.0);
    }
}
