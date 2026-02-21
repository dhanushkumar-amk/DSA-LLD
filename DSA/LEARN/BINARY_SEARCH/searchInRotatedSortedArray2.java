package DSA.LEARN.BINARY_SEARCH;

public class searchInRotatedSortedArray2 {

    public static void main(String[] args) {
        int[] arr = {7,8,9,1,1,1,1,1,1,1,1,1,1,2,3,4,5,6};
        int target = 1;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }


    private static boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target)
                return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]){
                low += 1;
                high -= 1;
                continue;
            }

            // left sorted
            if (arr[low] <= arr[mid]){
                if (arr[low] <= target && target <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }else{
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}
