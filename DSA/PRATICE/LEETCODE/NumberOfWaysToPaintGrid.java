package DSA.PRATICE.LEETCODE;

//problem url => https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/?envType=daily-question&envId=2026-01-03
// problem name => - Number of Ways to Paint N × 3 Grid

public class NumberOfWaysToPaintGrid {

    public static void main(String[] args) {
        int ans  = numOfWays(5000);
        System.out.println(ans);

    }


    public static int numOfWays(int n) {
        long MOD = (long) (1e9 + 7);

        long a = 6;
        long b = 6;

        for (int i = 2; i <= n; i++) {
            long newA = ( 2 * a + 2 * b) % MOD;
            long newB = ( 2 * a + 3 * b) % MOD;

            a = newA;
            b = newB;
        }
        return (int) ((a + b) % MOD);
    }

}
