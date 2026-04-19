package DSA.LEARN.GRAPH;

public class GraphRepresentationMatrix {
    public static void main(String[] args) {
        int n = 5, m = 6;

        int[][] matrix = new int[n + 1][m + 1];

        matrix[1][2] = 1;
        matrix[2][1] = 1;

        matrix[1][3] = 1;
        matrix[3][1] = 1;

        matrix[3][4] = 1;
        matrix[4][3] = 1;

        matrix[2][4] = 1;
        matrix[4][2] = 1;

        matrix[2][5] = 1;
        matrix[5][2] = 1;

        matrix[4][5] = 1;
        matrix[5][4] = 1;

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // weighted graph

    }
}
