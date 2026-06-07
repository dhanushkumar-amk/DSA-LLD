package DSA.LEARN.ARRAY;

import java.util.ArrayList;
import java.util.Collections;

public class SeperateTheDigitFromArray {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int number = nums[i];

            ArrayList<Integer> temp = new ArrayList<>();

            while (number > 0) {
                int lastDigit = number % 10;
                temp.add(lastDigit);
                number = number / 10;
            }

            Collections.reverse(temp);

            list.addAll(temp);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        SeperateTheDigitFromArray obj = new SeperateTheDigitFromArray();

        int[] nums = {13, 25, 83, 77};

        int[] ans = obj.separateDigits(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}