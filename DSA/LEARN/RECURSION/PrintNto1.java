package DSA.LEARN.RECURSION;

public class PrintNto1 {
    public static void main(String[] args) {
//        print(1, 5);
   print2(5);
    }


    private static void print(int i, int n){
        if (i > n)
            return;
        print(i + 1, n);
        System.out.println(i);
    }


    private static void print2(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }

          System.out.println(n);
        print2(n - 1);
    }
}
