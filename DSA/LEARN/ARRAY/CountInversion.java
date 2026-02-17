package DSA.LEARN.ARRAY;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        int ans = countInversion1(arr);
        System.out.println(ans);
    }

    // brute force
    private static int countInversion1(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }
}
