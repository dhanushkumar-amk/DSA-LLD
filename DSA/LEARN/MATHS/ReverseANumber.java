package DSA.LEARN.MATHS;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1234;
        int ans = reverseNumber(n);
        System.out.println(ans);
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
