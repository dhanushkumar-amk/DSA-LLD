package LLD.SOLID.S.BAD;

public class Invoice {
    private String customerName;
    private double amount;

    public Invoice(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    // 🚨 Responsibility 1: Business logic - calculating totals
    public double calculateTotalWithTax() {
        return amount + (amount * 0.18);
    }

    // 🚨 Responsibility 2: Printing/formatting - a completely different concern!
    public void printInvoice() {
        System.out.println("Invoice for: " + customerName);
        System.out.println("Total (with tax): " + calculateTotalWithTax());
    }

    // 🚨 Responsibility 3: Persistence - saving to database, yet another concern!
    public void saveToDatabase() {
        System.out.println("Saving invoice for " + customerName + " to database...");
    }
}