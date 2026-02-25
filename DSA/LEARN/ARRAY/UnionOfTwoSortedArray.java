package DSA.LEARN.ARRAY;

import java.util.*;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,4,5};
        int[] arr2 = {1,1,3,3,6,6,7,7,8};

        int[] ans = unionArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));

        ArrayList<Integer> list = union2(arr1, arr2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    //  brute force
    private static int[] unionArray(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int[] temp = new int[set.size()];

        int i = 0;
        for(int element : set){
            temp[i++] = element;
        }
        return temp;
    }

    // better solution
    private static ArrayList<Integer> union2(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }


    // optimal Approach
    private static ArrayList<Integer> union(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n1 && j < n2){
            if (arr1[i] <= arr2[j]){
                if (ans.isEmpty() || ans.getLast() != arr1[i])
                    ans.add(arr1[i]);
                i++;
            }
            else{
                if (ans.isEmpty() || ans.getLast() != arr2[j])
                    ans.add(arr2[j]);
                j++;
            }
        }

        while (j < n2){
            if (ans.isEmpty() || ans.getLast() != arr2[j])
                ans.add(arr2[j]);
            j++;
        }

        while (i < n1){
            if (ans.isEmpty() || ans.getLast() != arr1[i])
                ans.add(arr1[i]);
            i++;
        }
        return ans;
    }

}
