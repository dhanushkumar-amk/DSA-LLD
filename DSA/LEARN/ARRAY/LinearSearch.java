package DSA.LEARN.ARRAY;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,6,3,45,2,16,7,8};
        int ans = linearSearch(arr, 16);
        System.out.println(ans);
    }

    private static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
