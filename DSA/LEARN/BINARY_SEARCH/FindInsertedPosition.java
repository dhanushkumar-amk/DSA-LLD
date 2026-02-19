package DSA.LEARN.BINARY_SEARCH;

public class FindInsertedPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 6;
        int ans = findPosition(arr, target);
        System.out.println(ans);
    }
    private static int findPosition(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        int ans = arr.length + 1;

        while (low < high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target)
                ans = mid;

            if (arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
