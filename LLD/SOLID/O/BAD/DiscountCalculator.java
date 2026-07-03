package LLD.SOLID.O.BAD;

public class DiscountCalculator {

    // 🚨 PROBLEM: every new customer type means editing THIS method again
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("REGULAR")) {
            return amount * 0.05; // 5% discount
        } else if (customerType.equals("PREMIUM")) {
            return amount * 0.10; // 10% discount
        } else if (customerType.equals("VIP")) {
            return amount * 0.20; // 20% discount
        }
        // Tomorrow: "PLATINUM" customer type added? Add ANOTHER else-if here...
        return 0;
    }
}