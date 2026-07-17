package DSA.HACKER_RANK;

import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {

    }

     public static int simpleArraySum(List<Integer> arr) {
        int sum = 0;
         for (int i = 0; i < arr.size(); i++) {
             sum += arr.get(i);
         }
         return sum;
    }
}