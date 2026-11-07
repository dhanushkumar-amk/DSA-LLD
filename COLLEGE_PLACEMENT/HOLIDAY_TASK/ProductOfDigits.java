package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class ProductOfDigits {
    static void main(String[] args) {
        product(234);
    }

     private static void product(int n){
        int product = 1;

        while (n != 0) {
            int remainder = n % 10;
            product *= remainder;
            n /= 10;
        }
            System.out.println(product);
    }
}
