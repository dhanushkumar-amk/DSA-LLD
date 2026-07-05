package LLD.KISS.GOOD;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        boolean isEven = (number % 2 == 0);
        System.out.println("Is " + number + " even? " + isEven);
    }
}

// One line. Solves the exact same problem. No unnecessary abstraction.