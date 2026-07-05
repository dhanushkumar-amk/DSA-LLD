package LLD.YAGNI.BAD;

public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Only Credit Card is actually needed RIGHT NOW
    public void payByCard() {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    // 🚨 Nobody asked for this yet - built "just in case"
    public void payByCrypto() {
        System.out.println("Paid " + amount + " using Crypto");
    }

    // 🚨 Nobody asked for this yet either - "future-proofing"
    public void payByBankTransfer() {
        System.out.println("Paid " + amount + " using Bank Transfer");
    }

    // 🚨 Even added currency conversion for currencies nobody uses yet
    public double convertToUSD(double amount, String fromCurrency) {
        // dummy conversion logic never even tested properly
        return amount * 0.012;
    }
}


// All this extra code sits unused, untested, and unmaintained — just adding clutter
// and confusion for a requirement that may never even show up.