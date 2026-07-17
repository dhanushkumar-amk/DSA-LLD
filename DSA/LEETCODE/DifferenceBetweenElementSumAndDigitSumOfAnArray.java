package DSA.LEETCODE;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {

    static void main() {
        int[] nums = {1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

         for (int i = 0; i < nums.length; i++) {
             elementSum += nums[i];
             int num = nums[i];
             while (num != 0){
                 int remainder = num % 10;
                 digitSum += remainder;
                 num = num / 10;
             }
         }
         return Math.abs(elementSum - digitSum);
    }
}
