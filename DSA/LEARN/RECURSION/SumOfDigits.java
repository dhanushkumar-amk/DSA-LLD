package DSA.LEARN.RECURSION;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(13421);
        System.out.println(ans);
    }


    private static int sum(int n){
        if (n == 0)
            return 0;
        int lastDigit =  n % 10;
        return  lastDigit +  sum(n / 10);
    }
}
