package LLD.YAGNI.BAD;

public class Main {
    static void main() {
        Payment payment = new Payment(10000);
        payment.payByCard(); // user actually want  right now

        // unwanted features for current requirements
        payment.convertToUSD(1000, "inr");
        payment.payByCrypto();
        payment.payByBankTransfer();
    }
}
