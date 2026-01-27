package DSA.LEARN.RECURSION;

public class SumOfNNumbers {
    public static void main(String[] args) {
//        sum(5, 0);
        System.out.println(add(5));
    }


    private static void sum(int i, int value){
       if (i < 1) {
           System.out.println(value);
           return;
       }
       sum(i - 1, value + i);
    }

    private static int add(int n){
        if (n == 0)
            return 0;
        return n + add(n - 1);
    }

}
