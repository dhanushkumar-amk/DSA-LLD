package DSA.LEARN.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, -2,-2,-1, -2,0,0, -1, 2,2,2,0,2};
        List<List<Integer>> ans = sum(arr);

        for(var ele : ans)
            for(var i : ele) {
                System.out.print(i + " ");
            }

    }

    private static List<List<Integer>> sum(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int j = i + 1;
            int k = arr.length - 1;


            while (j < k){
               int sum = arr[i] + arr[j] + arr[k];

               if (sum < 0){
                   j++;
               } else if (sum > 0) {
                   k--;
               }else{
                   List<Integer> triplets = new ArrayList<>();
                   triplets.add(arr[i]);
                   triplets.add(arr[j]);
                   triplets.add(arr[k]);
                   ans.add(triplets);
                   j++;
                   k--;

                   while (arr[j] == arr[j - 1])
                       j++;

                   while (arr[k] == arr[k + 1])
                       k--;
                 }
            }
        }

        return ans;
    }
}
