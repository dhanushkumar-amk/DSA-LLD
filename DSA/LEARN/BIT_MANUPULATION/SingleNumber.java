package DSA.LEARN.BIT_MANUPULATION;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }

    public static int singleNumber(int[] arr){
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
