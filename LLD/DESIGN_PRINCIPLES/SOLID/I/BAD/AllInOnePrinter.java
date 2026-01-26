package LLD.DESIGN_PRINCIPLES.SOLID.I.BAD;

public class AllInOnePrinter implements Machine{

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning");
    }

    @Override
    public void fax() {
        System.out.println("Faxed...");
    }
}
