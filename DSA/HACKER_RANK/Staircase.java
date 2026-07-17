package DSA.HACKER_RANK;

public class Staircase {


    static void main() {
        staircase(5);
    }

      public static void staircase(int n) {

          for (int i = 0; i < n; i++) {

              for (int space = 0; space < n - i; space++) {
                  System.out.print(" ");
              }

               for (int hash = 1; hash <= i; hash++) {
                System.out.print("#");
            }

              System.out.println();
          }

    }
}
