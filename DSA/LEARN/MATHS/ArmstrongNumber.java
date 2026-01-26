package DSA.LEARN.MATHS;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 371;
        boolean ans = isArmStrongNumber(n);
        System.out.println(ans);
    }

    public static boolean isArmStrongNumber(int n){
        int ans = 0;
        int initialValue = n;

        while (n > 0){
            int lastValue = n % 10;
            ans += lastValue * lastValue * lastValue;
            n /= 10;
        }

        if (initialValue == ans)
            return true;
        else
            return false;
    }
}
