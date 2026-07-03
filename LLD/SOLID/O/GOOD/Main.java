package LLD.SOLID.O.GOOD;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular: " + calculator.calculateDiscount(new RegularDiscount(), 1000));
        System.out.println("Premium: " + calculator.calculateDiscount(new PremiumDiscount(), 1000));
        System.out.println("VIP: " + calculator.calculateDiscount(new VIPDiscount(), 1000));

        // 🎉 Tomorrow: want to add PLATINUM discount?
        // Just create a new PlatinumDiscount.java class - NO CHANGE to DiscountCalculator.java at all!
        System.out.println("Platinum: " + calculator.calculateDiscount(new PlatinumDiscount(), 1000));
    }
}