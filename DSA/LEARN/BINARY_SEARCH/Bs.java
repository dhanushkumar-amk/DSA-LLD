package DSA.LEARN.BINARY_SEARCH;

public class Bs {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,10,13,17};
        int target = 13;
        int ans = recursive(arr, target);
        System.out.println(ans);
    }

    // iterative code
    private static int iterative(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }


    // recursive code
    private static int recursive(int[] arr, int target){
        return helper(arr, 0, arr.length - 1, target);
    }

    private static int helper(int[] arr, int low, int high, int target){
        // base case
        if (low < high)
            return -1;

        int mid = (low + high)/2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target)
            return helper(arr, mid + 1, high, target);
        else
           return helper(arr, low, mid - 1, target);
    }
}
