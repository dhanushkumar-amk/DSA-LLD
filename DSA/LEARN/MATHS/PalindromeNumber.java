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
}
