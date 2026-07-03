package DSA.NEETCODE_150;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] arr, int hour) {
         int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long totalHours = findTotalHoursWouldTakenByKoko(arr, mid);

            if (totalHours <= hour) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static long findTotalHoursWouldTakenByKoko(int[] arr, int mid) {
        long totalHour = 0;

        for (int i = 0; i < arr.length; i++) {
            totalHour += (long) Math.ceil((double) arr[i] / mid);
        }

        return totalHour;
    }
}