package DSA.LEARN.ARRAY;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 2, 5,6,7,8};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1])
                continue;
            else
                return false;
        }
        return true;
    }
}
