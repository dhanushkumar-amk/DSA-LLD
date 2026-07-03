package OOPS.ABSTRACT_CLASS;

public class Main {
    static void main() {
        Son son = new Son(21);
        son.career("Doctor");

        Daughter daughter = new Daughter(22);
        daughter.career("Collector");

        Parent.greetings();
    }
}
