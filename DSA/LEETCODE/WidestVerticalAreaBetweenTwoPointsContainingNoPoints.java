package DSA.LEETCODE;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {


    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;


        int[] row = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            row[i] = points[i][0];
        }

        Arrays.sort(row);

        for (int i = 0; i < row.length -1; i++) {
            int gap = Math.abs(row[i] - row[i + 1]);
            max = Math.max(gap, max);
        }

        return max;
    }

}
