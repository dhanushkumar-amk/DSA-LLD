package DSA.LEARN.BINARY_SEARCH;

public class SquareRootofAnInteger {
    public static void main(String[] args) {
        int n = 28;

        // in build method
        int ans1 = (int) Math.sqrt(n);
        System.out.println(ans1);

        int ans2 = liner(n);
        System.out.println(ans2);

        int ans3 = binary(n);
        System.out.println(ans3);
    }

    // liner search
    private static int liner(int n){
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            if (i * i <= n)
                ans = i;
            else
                break;
        }
        return ans;
    }

    // binary search
    private static int binary(int n){
        int low = 0;
        int high = n;

        int ans = -1;
        while (low <= high){
            int mid = low + (high - low)/2;

            if (mid * mid == n)
                return mid;

            if (mid * mid < n){
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
