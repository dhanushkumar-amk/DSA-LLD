package DSA.LEETCODE;

public class SmallestDivisibleDigitProductI {

    public int smallestNumber(int n, int t) {

        while (true) {
            int temp = n;
            int product = 1;

            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }

    public static void main(String[] args) {
        SmallestDivisibleDigitProductI obj = new SmallestDivisibleDigitProductI();

        System.out.println(obj.smallestNumber(10, 2));
        System.out.println(obj.smallestNumber(15, 3));
        System.out.println(obj.smallestNumber(14, 7));
    }
}