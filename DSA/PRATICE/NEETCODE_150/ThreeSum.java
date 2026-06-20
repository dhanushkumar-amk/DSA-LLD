package DSA.PRATICE.NEETCODE_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum2(nums, i, ans);
            }
        }

        return ans;
    }

    private static void twoSum2(int[] nums, int i, List<List<Integer>> ans) {

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[i] + nums[left] + nums[right];

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {

                List<Integer> result = new ArrayList<>();

                result.add(nums[i]);
                result.add(nums[left]);
                result.add(nums[right]);

                ans.add(result);

                left++;
                right--;

                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }

                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
        }
    }
}
