package DSA.PATTERN_PRINTING;

public class Star {
    static void main(String[] args) {
        pattern3(5);
    }


//    Pattern 1
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


/*
*****
*****
*****
*****
*****
 */


//    pattern2
    public static void pattern2(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*

*
**
***
****
*****

*/


//    pattern 3
public static void pattern3(int n){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

/*

******
****
***
**
*

*/

}
