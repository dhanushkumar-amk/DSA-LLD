package DSA.LEARN.ARRAY;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {4,6,3,12,55,76,2,8,43};
        int ans = smallest(arr);
        System.out.println(ans);
    }



    private static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
