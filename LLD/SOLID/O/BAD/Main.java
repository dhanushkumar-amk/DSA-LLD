package LLD.SOLID.O.BAD;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("VIP discount: " + calculator.calculateDiscount("VIP", 1000));
    }
}