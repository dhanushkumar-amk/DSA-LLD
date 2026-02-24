package DSA.LEARN.BINARY_SEARCH;

public class HowManyTimeArrayShouldRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int ans = rotate(arr);
        System.out.println("Array rotated times = " + ans);
    }

    private static int rotate(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){

            // If array is already sorted
            if(arr[low] <= arr[high]){
                return low;
            }

            int mid = low + (high - low)/2;

            // Check if mid is minimum
            if(mid > 0 && arr[mid] < arr[mid - 1]){
                return mid;
            }

            // Decide which half to search
            if(arr[low] <= arr[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }
}