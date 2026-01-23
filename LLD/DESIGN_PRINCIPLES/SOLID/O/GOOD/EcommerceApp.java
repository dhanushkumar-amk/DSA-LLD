package LLD.DESIGN_PRINCIPLES.SOLID.O.GOOD;

public class EcommerceApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Existing payment methods
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod bitcoin = new BitcoinPayment();

        // NEW payment methods (no code change in PaymentProcessor!)
        PaymentMethod googlePay = new GooglePayPayment();
        PaymentMethod applePay = new ApplePayPayment();

        // All work the same way
        processor.process(creditCard, 100.0);
        processor.process(paypal, 200.0);
        processor.process(bitcoin, 300.0);
        processor.process(googlePay, 400.0);
        processor.process(applePay, 500.0);
    }
}
