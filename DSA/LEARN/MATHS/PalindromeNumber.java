package DSA.LEARN.MATHS;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean ans = isPalindrome(12321);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int n){
        int reverseNumber = reverseNumber(n);
        if (n == reverseNumber)
            return true;
        else
            return false;
    }

    public static int reverseNumber(int n){
        int ans = 0;
        while (n > 0){
            int lastDigit = n % 10;
            ans = ans * 10 + lastDigit;
            n = n/10;
        }
        return ans;
    }

     public boolean isPalindrome1(int x) {
        int temp = Math.abs(x);
        int sum = 0;

        while (x > 0){
            int lastDigit = x % 10;
            sum = sum * 10 + lastDigit;
            x = x / 10;
        }
        if (sum == temp)
            return true;
        else return false;
    }
}
