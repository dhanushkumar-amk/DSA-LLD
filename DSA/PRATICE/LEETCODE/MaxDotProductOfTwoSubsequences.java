package DSA.PRATICE.LEETCODE;

import java.util.Arrays;

public class MaxDotProductOfTwoSubsequences {

    int[] nums1, nums2;
    int[][] memo;
    int n, m;
    final int NEG_INF = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] nums1 = {3, -1};
        int[] nums2 = {2, -6, 7};

        MaxDotProductOfTwoSubsequences obj = new MaxDotProductOfTwoSubsequences();
        int ans = obj.maxDotProduct(nums1, nums2);
        System.out.println(ans); // Expected: 21
    }

    public int maxDotProduct(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        n = nums1.length;
        m = nums2.length;

        memo = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], NEG_INF);
        }

        return dfs(0, 0);
    }

    private int dfs(int i, int j) {
        // If we reach end of any array, no valid pair possible
        if (i == n || j == m) {
            return NEG_INF;
        }

        if (memo[i][j] != NEG_INF) {
            return memo[i][j];
        }

        // Option 1: Take both elements
        int take = nums1[i] * nums2[j];
        int next = dfs(i + 1, j + 1);

        // Only add future result if it increases value
        take += Math.max(0, next);

        // Option 2: Skip nums1[i]
        int skip1 = dfs(i + 1, j);

        // Option 3: Skip nums2[j]
        int skip2 = dfs(i, j + 1);

        // Store and return the maximum
        memo[i][j] = Math.max(take, Math.max(skip1, skip2));
        return memo[i][j];

    }
}


// hello world
