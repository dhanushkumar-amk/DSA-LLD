package LLD.DESIGN_PRINCIPLES.SOLID.I.GOOD;

public class Main {
    public static void main(String[] args) {
        BasicPrinter printer = new BasicPrinter();
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        printer.print();

        allInOnePrinter.scan();
        allInOnePrinter.fax();
        allInOnePrinter.print();
    }
}
