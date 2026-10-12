package DSA.LEETCODE;

import java.util.List;

public class ApplyOperationsOnArrayToMaximizeSumOfSquares {
    static void main(String[] args) {

    }


     public int maxSum(List<Integer> nums, int k) {
        int[] count = new int[30];

        for(int x : nums){
            for (int i = 0; i < 30; i++) {
                if ((x >> i & 1) == 1)
                    count[i]++;
            }
        }

        long MOD = 1_000_000_007L;
        long result = 0;

         for (int i = 0; i < k; i++) {
             long current = 0;
             for (int j = 0; j < 30; j++) {
                 if (count[j] > 0){
                     current |= (1L << j);
                     count[j]--;
                 }
             }
             result = (result + (current % MOD) * (current % MOD)) % MOD;
         }
         return (int) result;
    }
}
