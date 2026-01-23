package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class PaymentProcessor {
    public void process(PaymentMethod paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}
