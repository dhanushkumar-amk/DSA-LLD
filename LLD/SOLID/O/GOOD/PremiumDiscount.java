package LLD.SOLID.O.GOOD;

public class PremiumDiscount implements DiscountStrategy{
    @Override
    public double calculate(double amount) {
        return amount * 0.10;
    }
}
