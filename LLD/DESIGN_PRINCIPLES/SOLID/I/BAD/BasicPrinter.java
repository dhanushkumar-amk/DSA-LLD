package LLD.DESIGN_PRINCIPLES.SOLID.I.BAD;

public class BasicPrinter implements Machine{
    @Override
    public void print() {
        System.out.println("Printed");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Can't scan");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Can't fax");
    }
}
