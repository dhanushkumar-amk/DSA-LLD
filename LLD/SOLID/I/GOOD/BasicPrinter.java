package LLD.SOLID.I.GOOD;

// Implements ONLY what it can genuinely do - no fake methods, no exceptions!
public class BasicPrinter implements Printable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}