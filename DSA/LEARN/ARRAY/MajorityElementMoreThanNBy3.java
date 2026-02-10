package DSA.LEARN.ARRAY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementMoreThanNBy3 {
    public static void main(String[] args) {
    int[] arr = {1,1,1,1,2,2,3,3,3,3};
    int n = arr.length;

        List<Integer> ans = majorityElement(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> majorityElement(int[] arr, int n){
        int count1 = 0;
        int count2 = 0;
        
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && element2 != arr[i]) {
                count1++;
                element1 = arr[i];
            } else if (count1 == 0 && element1 != arr[i]) {
                count2++;
                element2 = arr[i];
            } else if (element1 == arr[i]) {
                count1++;
            } else if (element2 == arr[i]) {
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(element1 == arr[i])
                count1++;
            if (element2 == arr[i])
                count2++;
        }
        int minimalValue = (int) (n/3);

        if(count1 >= minimalValue)
            ans.add(element1);
        if(count2 >= minimalValue)
            ans.add(element2);

        Collections.sort(ans);
        return ans;
    }
}
