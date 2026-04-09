package DSA.LEARN.RECURSION;

public class CountZeros {
    public static void main(String[] args) {
        int n = 100000002;
        System.out.println(countZero(n));
    }

    static int count = 0;
    private static int countZero(int n){
        if (n == 0)
            return count;

        int lastDigit = n % 10;
        if (lastDigit == 0)
            count++;

        return countZero(n / 10);
    }
}
