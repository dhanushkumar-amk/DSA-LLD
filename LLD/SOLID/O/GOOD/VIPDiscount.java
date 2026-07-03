package LLD.SOLID.O.GOOD;

public class VIPDiscount implements DiscountStrategy{
    @Override
    public double calculate(double amount) {
        return amount * 0.15;
    }
}
