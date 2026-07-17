package DSA.PATTERN_PRINTING;

public class Number {
    static void main(String[] args) {
        pattern3(5);
    }


//patten 1
public static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
1
12
123
1234
12345

*/


//    pattern 2
    public static void pattern2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
1
22
333
4444
55555

*/

//    pattern 3
    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


/*
12345
1234
123
12
1

*/


}
