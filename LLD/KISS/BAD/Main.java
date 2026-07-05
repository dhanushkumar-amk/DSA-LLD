package LLD.KISS.BAD;

public class Main {
    public static void main(String[] args) {
        NumberCheckerContext context = new NumberCheckerContext(new EvenCheckStrategy());
        System.out.println("Is 10 even? " + context.isEven(10));
    }
}

// Three files, an interface,
// a strategy class, a context class -
// just to check if a number is even. Total overkill.