package DSA.PRATICE.CODING_NINJA;

import java.util.ArrayList;
import java.util.Collections;

public class FindDuplicateInArray {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
         arr.add(2);
          arr.add(2);
           arr.add(3);
            arr.add(4);

            int ans = findDuplicate(arr, arr.size());
        System.out.println(ans);
    }

     public static int findDuplicate(ArrayList<Integer> arr, int n){

         Collections.sort(arr);

        if (arr.size() <= 1)
            return arr.get(0);
        int ans = -1;
         for (int i = 0; i < arr.size() - 1; i++) {
             if (arr.get(i) == arr.get(i + 1))
                ans = arr.get(i);
         }
         return ans;
    }
}
