package LLD.SOLID.O.GOOD;

public class DiscountCalculator {
    // 🔑 Depends on the ABSTRACTION, not on specific customer types
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.calculate(amount);
    }
}
