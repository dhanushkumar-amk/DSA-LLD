package LLD.SOLID.I.GOOD;

// Implements ALL three - because it genuinely CAN do all three
public class AllInOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}