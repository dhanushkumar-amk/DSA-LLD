package DSA.LEARN.BINARY_SEARCH;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ans = shipWithinDays(arr, 5);
        System.out.println(ans);
    }

    public static int shipWithinDays(int[] arr, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            sum += i;
            max = Math.max(max, i);
        }

        int low = max;
        int high = sum;

        int ans = -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            int requiredDays = findRequiredDays(arr, mid);

            if (requiredDays <= days){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int findRequiredDays(int[] arr, int mid) {
        int currentDays = 1;
        int load = 0;

        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > mid){
                currentDays++;
                load = arr[i];
            }else {
                load += arr[i];
            }
        }
        return currentDays;
    }
}
