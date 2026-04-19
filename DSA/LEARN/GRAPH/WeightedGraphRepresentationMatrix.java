package DSA.LEARN.GRAPH;

public class WeightedGraphRepresentationMatrix {
    public static void main(String[] args) {
         int n = 5, m = 6;

        int[][] matrix = new int[n + 1][m + 1];

        // matrix[u][v] = weight

        matrix[1][2] = 2;
        matrix[2][1] = 2;

        matrix[1][3] = 4;
        matrix[3][1] = 4;

        matrix[3][4] = 6;
        matrix[4][3] = 6;

        matrix[2][4] = 2;
        matrix[4][2] = 2;

        matrix[2][5] = 6;
        matrix[5][2] = 6;

        matrix[4][5] = 9;
        matrix[5][4] = 9;

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
