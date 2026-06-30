package DSA.PRATICE.NEETCODE_150;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,4,6,7,8,9,10};
        System.out.println(search(nums, 7));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + high / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
