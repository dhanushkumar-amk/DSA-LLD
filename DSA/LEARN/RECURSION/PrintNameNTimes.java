package DSA.LEARN.RECURSION;

public class PrintNameNTimes {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n){
        if (n == 0)
            return;

        System.out.println("Dhanushkumar");
        n = n - 1;

        print(n);
    }
}
