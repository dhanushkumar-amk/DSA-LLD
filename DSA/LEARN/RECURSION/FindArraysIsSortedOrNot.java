package DSA.LEARN.RECURSION;

public class FindArraysIsSortedOrNot {
    public static void main(String[] args) {
         int[] arr = {1,2,4,15,6,8};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr){
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int i){
        if (i == arr.length - 1)
            return true;

        if (arr[i] < arr[i + 1])
            return helper(arr, i + 1);
        else
            return false;

//        return arr[i] < arr[i + 1] && helper(arr, i + 1);
    }

}

