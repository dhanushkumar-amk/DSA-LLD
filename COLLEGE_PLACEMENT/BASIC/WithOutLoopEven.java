package COLLEGE_PLACEMENT.BASIC;

public class WithOutLoopEven {
    static void main() {
        isEven(20);
    }

    public static void isEven(int n){
        if (n <= 1)
            return;

        System.out.println(n);
        isEven(n- 2);
    }
}
