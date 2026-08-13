package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

     public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right){
            if (numbers[left] + numbers[right] > target)
                right--;
            else if(numbers[left] + numbers[right] < target)
                left++;
            else
                return new int[]{left + 1, right + 1};

        }

        return new int[]{-1, -1};
    }
}
