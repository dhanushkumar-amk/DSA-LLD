package DSA.HACKER_RANK;

public class MarsExploration {
      public static int marsExploration(String s) {

      int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected;

            if (i % 3 == 1)
                expected = 'O';
            else
                expected = 'S';

            if (s.charAt(i) != expected)
                count++;
        }

        return count;
    }
}
