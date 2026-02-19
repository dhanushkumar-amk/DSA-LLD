package DSA.LEARN.BINARY_SEARCH;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 25;

        int floorIndex = floor(arr, target);
        int ceilIndex = ceil(arr, target);

        System.out.println("Floor = " +
                (floorIndex != -1 ? arr[floorIndex] : "Not Found") +
                " Ceil = " +
                (ceilIndex != -1 ? arr[ceilIndex] : "Not Found"));
    }

    private static int floor(int[] arr, int target){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int ceil(int[] arr, int target){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
