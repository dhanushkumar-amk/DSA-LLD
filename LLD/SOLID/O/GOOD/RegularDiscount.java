package LLD.SOLID.O.GOOD;

public class RegularDiscount implements DiscountStrategy{
    @Override
    public double  calculate(double amount) {
        return amount * 0.05;
    }
}
