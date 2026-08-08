package COLLEGE_PLACEMENT.JAVA_LEARNING.METHOD;

public class Intro {
   public static void main(String[] args) {

    greeting("dhanush");


    int ans = add(10, 20);
       System.out.println(ans);

    }

    public static void greeting(String name){
        System.out.println("Good Morning " + name);
    }


    public static int add(int a, int b){
       int c = a + b;
       return c;
    }


}
