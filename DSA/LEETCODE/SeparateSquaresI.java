package DSA.LEETCODE;

// problem name => Separate Squares I
// problem url => https://leetcode.com/problems/separate-squares-i/description/?envType=daily-question&envId=2026-01-13

public class SeparateSquaresI {

    public static void main(String[] args) {
        int[][] squares = {
                {0,0,1},
                {2,2,1}
        };

        double ans = separateSquares(squares);
        System.out.println(ans);

    }

    public static double separateSquares(int[][] squares) {
        double totalArea = 0;
        double low = Double.MAX_VALUE, high = 0;

        for (int[] s : squares) {
            double y = s[1], l = s[2];
            totalArea += l * l;
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        double target = totalArea / 2.0;

        while (high - low > 1e-5) { // enough for 1e-6 precision
            double mid = (low + high) / 2;
            double below = 0;

            for (int[] s : squares) {
                double y = s[1], l = s[2];

                if (mid <= y) {
                    // contributes nothing
                } else if (mid >= y + l) {
                    below += l * l;
                } else {
                    below += l * (mid - y);
                }
            }

            if (below < target) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

// modified




