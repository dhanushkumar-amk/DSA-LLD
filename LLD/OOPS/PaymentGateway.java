package LLD.OOPS;

public interface PaymentGateway {
    void initiatePayment(double amount);
}


class StripePayment implements PaymentGateway {
    public void initiatePayment(double amount) {
        System.out.println("Processing payment via Stripe: $" + amount);
    }
}


 class RazorpayPayment implements PaymentGateway {
    public void initiatePayment(double amount) {
        System.out.println("Processing payment via Razorpay: ₹" + amount);
    }
}

 class CheckoutService {
    private PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        paymentGateway.initiatePayment(amount);
    }
}