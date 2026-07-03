package OOPS.COMPARITORS;

public class LambdaExamples {

    public static void main(String[] args) {

        // =====================================================
        // 1. Addition
        // =====================================================
        Calculator add = (a, b) -> a + b;
        System.out.println("Add = " + add.operation(10, 20));

        // =====================================================
        // 2. Subtraction
        // =====================================================
        Calculator sub = (a, b) -> a - b;
        System.out.println("Sub = " + sub.operation(20, 5));

        // =====================================================
        // 3. Multiplication
        // =====================================================
        Calculator mul = (a, b) -> a * b;
        System.out.println("Mul = " + mul.operation(5, 4));

        // =====================================================
        // 4. Division
        // =====================================================
        Calculator div = (a, b) -> a / b;
        System.out.println("Div = " + div.operation(20, 4));

        // =====================================================
        // 5. Maximum
        // =====================================================
        Calculator max = (a, b) -> Math.max(a, b);
        System.out.println("Max = " + max.operation(30, 50));

        // =====================================================
        // 6. Minimum
        // =====================================================
        Calculator min = (a, b) -> Math.min(a, b);
        System.out.println("Min = " + min.operation(30, 50));

        // =====================================================
        // 7. Even Number
        // =====================================================
        NumberCheck even = n -> n % 2 == 0;
        System.out.println("Even = " + even.check(10));

        // =====================================================
        // 8. Odd Number
        // =====================================================
        NumberCheck odd = n -> n % 2 != 0;
        System.out.println("Odd = " + odd.check(11));

        // =====================================================
        // 9. Positive Number
        // =====================================================
        NumberCheck positive = n -> n > 0;
        System.out.println("Positive = " + positive.check(20));

        // =====================================================
        // 10. Negative Number
        // =====================================================
        NumberCheck negative = n -> n < 0;
        System.out.println("Negative = " + negative.check(-10));

        // =====================================================
        // 11. Square
        // =====================================================
        NumberOperation square = n -> n * n;
        System.out.println("Square = " + square.calculate(6));

        // =====================================================
        // 12. Cube
        // =====================================================
        NumberOperation cube = n -> n * n * n;
        System.out.println("Cube = " + cube.calculate(3));

        // =====================================================
        // 13. Reverse String
        // =====================================================
        StringOperation reverse =
                s -> new StringBuilder(s).reverse().toString();

        System.out.println(reverse.convert("Dhanush"));

        // =====================================================
        // 14. Uppercase
        // =====================================================
        StringOperation upper = s -> s.toUpperCase();
        System.out.println(upper.convert("java"));

        // =====================================================
        // 15. Lowercase
        // =====================================================
        StringOperation lower = s -> s.toLowerCase();
        System.out.println(lower.convert("JAVA"));

        // =====================================================
        // 16. String Length
        // =====================================================
        StringLength length = s -> s.length();
        System.out.println(length.length("Programming"));

        // =====================================================
        // 17. Print
        // =====================================================
        Printer print = s -> System.out.println(s);
        print.display("Hello Lambda");

        // =====================================================
        // 18. Greeting
        // =====================================================
        Printer greet = s -> System.out.println("Hello " + s);
        greet.display("Dhanush");

        // =====================================================
        // 19. Fixed Value
        // =====================================================
        Value value = () -> 100;
        System.out.println(value.get());

        // =====================================================
        // 20. Current Time
        // =====================================================
        Text text = () -> java.time.LocalTime.now().toString();
        System.out.println(text.get());
    }
}

/*
=========================================================
                Functional Interfaces
=========================================================
*/

/*
    Two Inputs -> One Output
*/
@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

/*
    One Input -> boolean
*/
@FunctionalInterface
interface NumberCheck {
    boolean check(int n);
}

/*
    One Input -> int
*/
@FunctionalInterface
interface NumberOperation {
    int calculate(int n);
}

/*
    One Input -> String
*/
@FunctionalInterface
interface StringOperation {
    String convert(String s);
}

/*
    One Input -> int
*/
@FunctionalInterface
interface StringLength {
    int length(String s);
}

/*
    One Input -> No Return
*/
@FunctionalInterface
interface Printer {
    void display(String s);
}

/*
    No Input -> int
*/
@FunctionalInterface
interface Value {
    int get();
}

/*
    No Input -> String
*/
@FunctionalInterface
interface Text {
    String get();
}