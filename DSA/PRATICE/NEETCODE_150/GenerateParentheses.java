package DSA.PRATICE.NEETCODE_150;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

    }

     public static List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            generate(result, 0, 0, n, "");
            return result;
    }

    private static void generate(List<String> result, int openingBraceCount, int closingBraceCount, int n, String unprocessed) {
        if (unprocessed.length() ==  2 * n){
            result.add(unprocessed);
            return;
        }

        if (openingBraceCount < n)
            generate(result, openingBraceCount + 1, closingBraceCount, n,unprocessed+"(");

        if (closingBraceCount < openingBraceCount){
            generate(result, openingBraceCount, closingBraceCount + 1, n, unprocessed + ")");
        }

    }
}
