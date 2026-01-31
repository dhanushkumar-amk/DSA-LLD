package DSA.LEARN.ARRAY;

public class FindElementOnceInTwiceArray {
    public static void main(String[] args) {
        int[] arr = {-1,-1,2,2,3,3,4,4,5,5,7,7,8,9,9};
        System.out.println(findElementXor(arr));
    }


    // bruteforce
    private static int findElement(int[] arr){
        int n = arr.length;
        int element = -1;
        if (arr[n - 1] != arr[n- 2])
            return arr[n - 1];

        for (int i = 1; i < n; i+= 2) {
            if (arr[i] != arr[i - 1]){
             element = arr[i - 1];
             break;
            }
        }
        return element;
    }

    // optimal
    private static int findElementXor(int[] arr){
        int xor = 0;
        for (int j : arr) {
            xor = xor ^ j;
        }
        return xor;
    }

}
