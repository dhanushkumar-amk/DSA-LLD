package DSA.LEARN.BINARY_SEARCH;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] arr = {25,46,28,49,24};
        int ans = findPages(arr, 4);
        System.out.println(ans);
    }

    public static int findPages(int[] arr, int students) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i : arr){
            max = Math.max(max, i);
            sum += i;
        }

        int low = max;
        int high = sum;
        int ans = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if (isPossibleAllocation(arr, mid, students) > students){
                low = mid + 1;
            }else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int isPossibleAllocation(int[] arr, int mid, int students) {
        int studentCount = 1;
        long pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= mid) {
                pagesStudent += arr[i];
            } else {
                studentCount++;
                pagesStudent = arr[i];
            }
        }
        return studentCount;
    }
}
