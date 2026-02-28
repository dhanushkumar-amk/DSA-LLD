package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int ans = divisor2(arr, 6);
        System.out.println(ans);
    }

    // brute force
    private static int divisor1(int[] arr, int threshold) {
        int d;
        for (d = 1; d < Arrays.stream(arr).max().getAsInt(); d++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Math.ceilDiv(arr[i], d);
            }
            if (sum <= threshold)
                return d;
        }
        return -1;
    }

    private static int divisor2(int[] arr, int threshold) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        int ans = -1;
        while (low <= high){
            int mid = low + (high - low)/2;

            if (sumOfDivisions(arr, mid) <= threshold){
                    ans = mid;
                    high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int sumOfDivisions(int[] arr, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / mid);
        }
        return sum;
    }
}
