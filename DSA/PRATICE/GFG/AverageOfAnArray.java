package DSA.PRATICE.GFG;

public class AverageOfAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 7, 5, 3};
        double ans = average(arr);
        System.out.println(ans);
    }

    private static double average(int[] arr){
        double sum = 0;

        int n = arr.length;

        for(int i : arr)
            sum += i;

        return sum / n;
    }
}
