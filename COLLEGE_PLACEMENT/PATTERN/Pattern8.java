package COLLEGE_PLACEMENT.PATTERN;

public class Pattern8 {

    public static void main(String[] args) {

        String s = "Program";
        int n = s.length();

        int i = 0;

        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                if (k == j || j + k == n + 1) {
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            i++;
            System.out.println();
        }
    }
}