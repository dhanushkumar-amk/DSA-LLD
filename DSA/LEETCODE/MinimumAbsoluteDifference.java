package DSA.LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = { 4,2,1,3 };
        List<List<Integer>> ans = minimumAbsDifference(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int  n = arr.length;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            min = Math.min(min, Math.abs(arr[i + 1] - arr[i]));
        }

        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == min)
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
        }
        return ans;
    }


}
