package DSA.LEETCODE;

public class MinimumMovesToEqualArrayElements {
      public int minMoves(int[] nums) {
        int minimum = Integer.MAX_VALUE;

        for(int num : nums){
            minimum = Math.min(minimum, num);
        }

        int sum = 0;

        for(int num : nums){
            sum += num - minimum;
        }

        return  sum;
    }
}
