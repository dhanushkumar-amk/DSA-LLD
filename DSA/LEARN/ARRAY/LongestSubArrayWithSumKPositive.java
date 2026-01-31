package DSA.LEARN.ARRAY;

public class LongestSubArrayWithSumKPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        int ans  = longestSubarrayWithSumK(arr, k);
        System.out.println(ans);
    }

    private static int longestSubarrayWithSumK(int[] arr, long k) {
        int left = 0;
        int right = 0;

        long sum = arr[0];
        int maxLength = 0;

        int n = arr.length;

        while (right < n){
           while (left <= right && sum > k){
               sum -= arr[left];
               left++;
           }

           if (sum == k)
               maxLength = Math.max(maxLength, right - left + 1);

            right++;
            if (right < n)
                sum += arr[right];
        }
        return maxLength;
    }


}
