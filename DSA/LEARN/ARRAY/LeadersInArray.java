package DSA.LEARN.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0, 6};
        ArrayList<Integer> ans = leaders(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(max);

        for (int i = arr.length - 1; i > 0 ; i--) {
            if (arr[i] > max){
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
