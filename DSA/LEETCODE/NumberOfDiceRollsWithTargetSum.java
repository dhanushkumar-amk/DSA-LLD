package DSA.LEETCODE;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {

    }


    final static int MOD = 1000_000_007;
    static Integer[][] dp;
     public static int numRollsToTarget(int n, int k, int target) {
         dp  = new Integer[n + 1][target + 1];
        return solve(n, k, target);
    }

    private static int solve(int n, int k, int target) {
        if(n == 0){
            if(target == 0)
                return 1;
            else return 0;
        }

        if (target < 0)
            return 0;

        if (dp[n][target] != null)
            return dp[n][target];

        int ans = 0;
        for (int i = 1; i <= k; i++) {
            ans += solve(n - 1, k, target - i);
            ans %= MOD;
        }
        return dp[n][target] = ans;
    }
}
