package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK3;

public class AutomorphicNumber {

    public static void main(String[] args) {
        System.out.println(autoMorphic(76));
    }

    private static boolean autoMorphic(int n) {
        int temp = n;
        int placeValue = 1;

        while (temp > 0) {
            placeValue *= 10;
            temp /= 10;
        }

        long squareNumber = (long) n * n;

        return squareNumber % placeValue == n;
    }
}
