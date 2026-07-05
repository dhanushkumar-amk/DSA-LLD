package LLD.SOLID.I.BAD;

public class AllInOnePrinter implements Machine {

    // here all in one printer can print, scan, fax also it is safe

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