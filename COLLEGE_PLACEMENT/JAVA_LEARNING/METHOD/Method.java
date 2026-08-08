package COLLEGE_PLACEMENT.JAVA_LEARNING.METHOD;

import java.util.Scanner;

public class Method {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = add(a, b);
        System.out.println(ans);

        String greet = greeting();
        System.out.println(greet);

        printStatement("dhanush");
    }




    public static int add(int a, int b){
        return a + b;
    }

    public static String greeting(){
        return "Good morning";
    }

    public static void printStatement(String name){
        System.out.println(name);
    }
}





