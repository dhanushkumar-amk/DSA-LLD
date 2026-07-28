package COLLEGE_PLACEMENT;

public class ShortestDistanceToACharacter {
    static void main(String[] args) {

    }


    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    int abs1 = Math.abs(i - j);
                    int abs =  (int) abs1;

                    min = Math.min(abs, min);
                }

                ans[i] = min;

            }
        }
        return ans;
    }
}
