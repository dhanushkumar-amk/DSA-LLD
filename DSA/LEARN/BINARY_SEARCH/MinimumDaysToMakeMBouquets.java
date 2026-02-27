package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class MinimumDaysToMakeMBouquets {

    public static void main(String[] args) {

        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int ans = minDaysBloom(arr, 2, 3);
        System.out.println(ans);   // Expected Output: 12
    }

    private static int minDaysBloom(int[] arr, int totalBouquets, int flowersNeeded) {

        // Not enough flowers
        if ((long) totalBouquets * flowersNeeded > arr.length)
            return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(arr, mid, totalBouquets, flowersNeeded)) {
                ans = mid;
                high = mid - 1;   // try smaller day
            } else {
                low = mid + 1;    // need more days
            }
        }

        return ans;
    }

    private static boolean isPossible(int[] arr, int day, int totalBouquets, int flowersNeeded) {

        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= day) {
                count++;
            } else {
                bouquets += count / flowersNeeded;
                count = 0;
            }
        }

        // last segment
        bouquets += count / flowersNeeded;

        return bouquets >= totalBouquets;
    }
}