package DSA.LEARN.RECURSION;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(12345, 0));
    }

    private static int reverse(int n, int sum){

        if (n == 0)
            return sum;

        int lastDigit = n % 10;
         sum = sum * 10 + lastDigit;
        return  reverse(n / 10, sum);
    }
}
