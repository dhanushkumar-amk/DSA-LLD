package DSA.LEARN.ARRAY;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,3,4,4,4,4,4,5,5,6,7,8,8,8,8,8,};
        int index = removeDuplicates(arr);
        for (int i = 0; i < index - 1; i++) {
            System.out.print(arr[i]);
        }

    }


    // bruteforce
    private static void removeDuplicateSet(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    // optimal => two pointers
    private static int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
