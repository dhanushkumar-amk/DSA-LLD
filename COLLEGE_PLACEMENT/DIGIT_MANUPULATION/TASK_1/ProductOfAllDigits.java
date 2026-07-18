package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK_1;

public class ProductOfAllDigits {
    static void main(String[] args) {
        // testcase 1 : 234
        System.out.println(productDigits(234));

        // testcase 2 : 105
        System.out.println(productDigits(105));
    }


    public static int productDigits(int n){
        int product = 1;

        while (n > 0){
            int remainder = n % 10;

            if (remainder == 0)
                return 0;

            product *= remainder;
            n /= 10;
        }
        return product;
    }
}
