package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

public class NegativeNumberInMatrix {
    static void main(String[] args) {
        int[][] matrix = {
                {1,-1, 5, -45},
                {-34,-5,-6,-76},
                {2,5,7,8},
        };

        System.out.println(countNegativesBrute(matrix));
    }

    public static int countNegativesBrute(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0)
                    count++;
            }
        }
        return count;
    }
}
