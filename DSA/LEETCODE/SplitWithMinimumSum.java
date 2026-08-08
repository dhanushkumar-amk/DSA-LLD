package DSA.LEETCODE;

import java.util.Arrays;

public class SplitWithMinimumSum {

    public int splitNum(int num) {
     char[] arr = Integer.toString(num).toCharArray();
     Arrays.sort(arr);

     int oddConcat = 0;
     int evenConcat = 0;

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';
            if (i % 2 == 0)
                evenConcat = evenConcat * 10 + digit;
            else
                oddConcat = oddConcat * 10 + digit;
        }
        return oddConcat + evenConcat;
    }

}
