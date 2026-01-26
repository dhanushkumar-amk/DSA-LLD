package DSA.LEARN.RECURSION;

public class Print1ToN {
    public static void main(String[] args) {
//            print(1, 5);
            printBackTrack(5,5);
    }

    private static void print(int i, int n){

        if (i > n)
            return;

        System.out.println(i);
        print(i + 1, n);
    }

    private static void printBackTrack(int i, int n){
        if (i < 1)
            return;

        printBackTrack(i - 1,n);
        System.out.println(i);
    }
}
