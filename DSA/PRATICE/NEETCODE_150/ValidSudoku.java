package DSA.PRATICE.NEETCODE_150;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        ValidSudoku obj = new ValidSudoku();
        System.out.println(obj.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {

            int N = 9;

            HashSet<Character>[] rowHashset = new HashSet[N];
            HashSet<Character>[] columnHashset = new HashSet[N];
            HashSet<Character>[] matrixHashset = new HashSet[N];

            for (int i = 0; i < N; i++) {
                rowHashset[i] = new HashSet<>();
                columnHashset[i] = new HashSet<>();
                matrixHashset[i] = new HashSet<>();
            }

            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {

                    char value = board[row][col];

                    if (value == '.')
                        continue;

                    // Check Row
                    if (rowHashset[row].contains(value))
                        return false;
                    rowHashset[row].add(value);

                    // Check Column
                    if (columnHashset[col].contains(value))
                        return false;
                    columnHashset[col].add(value);

                    // Check 3x3 Box
                    int index = (row / 3) * 3 + (col / 3);

                    if (matrixHashset[index].contains(value))
                        return false;
                    matrixHashset[index].add(value);
                }
            }

            return true;
    }
}