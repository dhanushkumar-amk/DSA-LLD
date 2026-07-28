package DSA.LEETCODE;

import java.util.Arrays;

public class HeightChecker {
    static void main(String[] args) {

    }


    public int heightChecker(int[] heights) {
     int[] demoArray = heights.clone();

        Arrays.sort(heights);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] == demoArray[i])
                continue;
            else
                count++;
        }

        return count;
    }
}
