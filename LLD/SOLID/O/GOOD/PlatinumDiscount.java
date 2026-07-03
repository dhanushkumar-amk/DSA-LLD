package LLD.SOLID.O.GOOD;

public class PlatinumDiscount implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.25; // 25% discount
    }
}