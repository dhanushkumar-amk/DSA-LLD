package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {0,3,4,7,9};
        int cows = 4;

        int ans = aggressiveCows(arr, cows);
        System.out.println(ans);
    }

    public static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        int ans = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (canWePlace(arr, mid, cows)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean canWePlace(int[] arr, int mid, int cows) {
        int cowCount = 1;
        int lastCow = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastCow >= mid){
                cowCount++;
                lastCow = arr[i];
            }

            if (cowCount >= cows)
                return true;
        }
       return false;
    }
}
