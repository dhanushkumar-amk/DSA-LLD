package DSA.LEARN.ARRAY;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};

        ArrayList<Integer> ansList = intersectionArray(arr1, arr2);
        for (int i = 0; i < ansList.size(); i++) {
            System.out.print(ansList.get(i) + " ");
        }

        System.out.println();

        ArrayList<Integer> ans = intersection(arr1, arr2);
        for (int i = 0; i < ansList.size(); i++) {
            System.out.print(ansList.get(i) + " ");
        }
    }

    // brute force
    private static ArrayList<Integer> intersectionArray(int[] arr1, int[] arr2){
       int n1 = arr1.length;
       int n2 = arr2.length;

       int[] visited = new int[n2];
       ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0){
                    list.add(arr1[i]);
                    visited[j]= 1;
                    break;
                }

                if (arr2[j] > arr1[i])
                    break;
            }
        }
       return list;
    }

    // optimal solution
    private static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;

        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> list = new ArrayList<>();
        while (i  < n1 && j < n2){
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }
}
