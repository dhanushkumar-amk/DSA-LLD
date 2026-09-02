package COLLEGE_PLACEMENT.ARRAYS.BINARY_SEARCH;

public class Binarysearch {
    static void main(String[] args) {
        int[] arr = {1,4,6,7,9,10, 20};
        int target = 6;

        System.out.println(binarySearch(arr, target));

    }

    private static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
