package DSA.PRATICE.LEETCODE;

import java.util.Arrays;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
        FindTheHighestAltitude solution = new FindTheHighestAltitude();

        int[] gain1 = {-5, 1, 5, 0, -7};
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};

        System.out.println(solution.largestAltitude(gain1)); // 1
        System.out.println(solution.largestAltitude(gain2)); // 0
    }

    public int largestAltitude(int[] gain) {

        // Store all altitudes including starting altitude 0
        int[] altitudes = new int[gain.length + 1];

        int point = 0;
        altitudes[0] = point;

        for (int i = 1; i <= gain.length; i++) {
            altitudes[i] = altitudes[i - 1] + gain[i - 1];
        }

        return Arrays.stream(altitudes)
                     .max()
                     .getAsInt();
    }
}