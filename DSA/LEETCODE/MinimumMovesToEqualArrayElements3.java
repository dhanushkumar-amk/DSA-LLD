package DSA.LEETCODE;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements3 {
      public int minMoves(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();

        int moves = 0;
        for(int num : nums){
            moves += max - num;
        }
        return moves;
    }
}
