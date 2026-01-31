package DSA.LEARN.ARRAY;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 6;
        int ans = missingNumber2(arr, n);
        System.out.println(ans);
    }

    private static int missingNumber1(int[] arr, int n){
        int totalSum = n * (n + 1)/2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
               actualSum += arr[i];
        }
        return totalSum - actualSum;
    }

    // xor approach not prepare
    private static int missingNumber2(int[] arr, int N){
        int xor1 = 0;
        int xor2 = 0;

        int n = N - 1;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }
}
