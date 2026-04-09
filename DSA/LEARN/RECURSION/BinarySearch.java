package DSA.LEARN.RECURSION;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int ans = binarySearch(arr, 5, 0, arr.length);
        System.out.println(ans);
    }


    private static int binarySearch(int[] arr, int target, int low, int high){

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (mid == target)
            return mid;

        if (arr[mid]  < target)
            return binarySearch(arr, target, mid + 1, high);
        else
            return binarySearch(arr, target, low, mid - 1);
    }

}
