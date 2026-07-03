package DSA.LEETCODE;

public class ConcatenationOfConsecutiveBinaryNumbers {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        int n = 3;
        int ans = concatenatedBinary(n);
        System.out.println(ans);
    }

    public static int concatenatedBinary(int n) {

        long val = 0;

        for (int i = 1; i <= n; i++) {

            int length = (int)(Math.log(i) / Math.log(2)) + 1;

            val = ((val << length) % MOD + i) % MOD;
        }

        return (int) val;
    }
}