package DSA.LEARN.BINARY_SEARCH;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,8,10,10,11};
        int target = 9;
        int ans = upperBound(arr, target);
        System.out.println(ans);
    }

    private static int upperBound(int[] arr, int target){
        int ans = arr.length + 1;

        int low = 0;
        int high = arr.length;

        while (low < high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target)
                ans = mid;

            if (arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
