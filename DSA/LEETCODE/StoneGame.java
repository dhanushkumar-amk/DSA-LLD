package DSA.LEETCODE;

public class StoneGame {

    Integer[][] dp;

    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        dp = new Integer[n][n];

        int total = 0;

        // find the sum
        for(int element : piles)
            total += element;

        int aliceScore = solve(piles, 0, n - 1);

        // get the total sum of piles then just simply substract the alice score in it
        int bobScore = total - aliceScore;
        return aliceScore > bobScore;

    }

    private int solve(int[] piles, int start, int end) {
        if (start > end)
            return 0;

        if (start == end)
            return piles[start];

        if (dp[start][end] != null)
            return dp[start][end];

        int left = piles[start] + Math.min(solve(piles, start + 2, end), solve(piles, start + 1, end - 1));
        int right = piles[end] + Math.min(solve(piles, start + 1, end - 1), solve(piles, start, end - 2));

        return dp[start][end] = Math.max(left, right);
    }
}
