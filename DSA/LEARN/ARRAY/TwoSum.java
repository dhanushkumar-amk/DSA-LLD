package DSA.LEARN.ARRAY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[ ] arr = {2,6,5,8,11};
        System.out.println(twoSum3(arr, 14));
    }

    // bruteforce
    private static boolean twoSum1(int[] arr, int target){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target)
                    return true;
            }
        }
        return false;
    }


    // better
    private static boolean twoSum2(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int require = target - element;

            if (map.containsKey(require))
                return true;
            else
                map.put(element, i);
        }
        return false;
    }

    // optimal but not recommended
    private static boolean twoSum3(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        Arrays.sort(arr);
        while (left < right){
            if (arr[left] + arr[right] < target)
                left++;
            else if (arr[left] + arr[right] > target)
                right--;
            else
                return true;
        }
        return false;
    }

}
