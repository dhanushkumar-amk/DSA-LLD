package LLD.OOPS.FUNCTIONS;

public class PassingExample {
    public static void main(String[] args) {
        String name = "dhanushkumar";

        greet(name);
    }

    private static void greet(String name) {
        System.out.println(name);
    }
}
