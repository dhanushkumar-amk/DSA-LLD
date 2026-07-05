package LLD.SOLID.I.BAD;

public class Main {
    static void main() {
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        BasicPrinter basicPrinter = new BasicPrinter();

        allInOnePrinter.fax("fax content");
        allInOnePrinter.scan("Scan content");
        allInOnePrinter.print("print content");

        // here it will only print not do scan and fax we are forcing here
        basicPrinter.fax("fax content");
        basicPrinter.scan("Scan content");
        basicPrinter.print("print content");
    }
}
