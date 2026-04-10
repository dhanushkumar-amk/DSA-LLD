package DSA.LEARN.RECURSION;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,65,65,48};
        System.out.println(linearSearch(arr, 615));
    }

    private static boolean linearSearch(int[] arr, int target){
        return helper(arr, target, 0);
    }

    private static boolean helper(int[] arr, int target, int index){
        if (index == arr.length)
            return false;

        if (arr[index] == target)
            return true;

        return helper(arr, target, index + 1);
    }
}
