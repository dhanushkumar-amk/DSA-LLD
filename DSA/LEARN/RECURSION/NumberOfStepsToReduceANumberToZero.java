package DSA.LEARN.RECURSION;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(count(n, 0));
    }

    private static int count(int n, int step){
        if (n == 0)
            return step;

        if (n % 2 == 0)
            return count(n / 2, step + 1);

        return count(n - 1, step + 1);
    }
}
