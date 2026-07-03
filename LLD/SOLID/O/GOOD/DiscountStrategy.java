package LLD.SOLID.O.GOOD;

// Abstraction - all discount types depend on THIS
public interface DiscountStrategy {
    public double  calculate(double amount);
}
