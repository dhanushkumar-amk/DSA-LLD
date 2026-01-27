package DSA.LEARN.RECURSION;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0, "madam"));
    }

    private static boolean isPalindrome(int i, String s){
        int n = s.length();
        if (i >= n/2)
            return true;

        if (s.charAt(i) != s.charAt(n - i - 1))
            return false;

       return isPalindrome(i + 1, s);
    }
}
