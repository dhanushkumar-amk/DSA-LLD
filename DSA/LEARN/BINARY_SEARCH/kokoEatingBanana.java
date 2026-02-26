package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int ans =  koko(arr, 8);
        System.out.println(ans);
    }

    private static int koko(int[] arr, int hour) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        int ans = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;

            long kokoTakenForEating = findTotalHoursWouldTakenByKoko(arr, mid);

            if (kokoTakenForEating <= hour) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static long findTotalHoursWouldTakenByKoko(int[] arr, int mid) {
        long totalHour = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHour += (long) Math.ceil((double) arr[i] / mid);
        }
        return totalHour;
    }
}
