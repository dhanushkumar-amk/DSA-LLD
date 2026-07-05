package LLD.YAGNI.GOOD;

public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Only what's actually required right now
    public void payByCard() {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}