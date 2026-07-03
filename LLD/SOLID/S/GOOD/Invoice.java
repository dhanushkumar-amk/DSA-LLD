
package LLD.SOLID.S.GOOD;

public class Invoice {
    private String customerName;
    private double amount;

    public Invoice(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    // ONLY responsibility: business logic for this invoice
    public double calculateTotalWithTax() {
        return amount + (amount * 0.18);
    }
}