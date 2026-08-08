package COLLEGE_PLACEMENT.JAVA_LEARNING.METHOD;

import java.util.Scanner;

public class ArithmeticOperation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = add(a, b);
        int sub = sub(a, b);
        int mul = mul(a, b);
        int div = div(a, b);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        for (int i = 0; i < 500 ; i++) {
            greet();
        }

    }


    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return  a * b;
    }

    public static int div(int a, int b){
        return  a / b;
    }

    public static void greet(){
        System.out.println("Hello");
    }
}
