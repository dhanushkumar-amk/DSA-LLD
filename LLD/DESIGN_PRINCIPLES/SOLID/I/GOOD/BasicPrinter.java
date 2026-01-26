package LLD.DESIGN_PRINCIPLES.SOLID.I.GOOD;

public class BasicPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printed...");
    }
}


class AllInOnePrinter implements Printer, FaxMachine, Scanner{

    @Override
    public void fax() {
        System.out.println("faxed...");
    }

    @Override
    public void print() {
        System.out.println("Printed...");
    }

    @Override
    public void scan() {
        System.out.println("scanned...");
    }
}