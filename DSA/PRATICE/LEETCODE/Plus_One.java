package DSA.PRATICE.LEETCODE;

import java.util.Arrays;

// problem name => leetcode  66
// problem url => https://leetcode.com/problems/plus-one/description/?envType=daily-question&envId=2026-01-01


public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {9,5,9};
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; --i) {
            if(digits[i] + 1 < 10){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] result =  new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
