package DSA.LEARN.ARRAY;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-12,4};
        int ans = maximumProduct(arr);
        System.out.println(ans);
    }

    private static int maximumProduct(int[] arr){
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}
