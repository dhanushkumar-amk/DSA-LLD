package DSA.PRATICE.NEETCODE_150;

import java.util.Arrays;

public class TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1}; // 1-indexed
            }
        }

        return new int[]{-1, -1};
    }
}