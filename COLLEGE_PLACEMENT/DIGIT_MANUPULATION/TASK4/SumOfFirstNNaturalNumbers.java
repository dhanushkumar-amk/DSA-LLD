package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

public class SumOfFirstNNaturalNumbers {
    static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(10));
    }

    private static int sumOfNaturalNumber(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
