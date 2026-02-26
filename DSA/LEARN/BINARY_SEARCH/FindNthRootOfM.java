package DSA.LEARN.BINARY_SEARCH;

public class FindNthRootOfM {
    public static void main(String[] args) {
        int n = 4;
        int m = 81;

        int ans = root(n, m);
        System.out.println(ans);
    }

    // binary search
    private static int root(int n, int m){
        int low = 1;
        int high = m;

        while (low <= high){
            int mid = low + (high - low)/2;

            int pow = (int) Math.pow(mid, n);

            if (pow == m)
                return mid;

            if (pow > m)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
