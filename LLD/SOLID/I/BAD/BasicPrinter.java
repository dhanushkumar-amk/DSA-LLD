package LLD.SOLID.I.BAD;

public class BasicPrinter implements Machine {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    // 🚨 PROBLEM: BasicPrinter CANNOT scan, but it's FORCED to implement this method anyway!
    @Override
    public void scan(String content) {
        throw new UnsupportedOperationException("This printer can't scan!");
    }

    // 🚨 PROBLEM: BasicPrinter CANNOT fax, but forced to implement this too!
    @Override
    public void fax(String content) {
        throw new UnsupportedOperationException("This printer can't fax!");
    }
}