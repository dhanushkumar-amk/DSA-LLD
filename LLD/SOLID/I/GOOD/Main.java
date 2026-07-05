package LLD.SOLID.I.GOOD;

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter allInOne = new AllInOnePrinter();
        allInOne.print("allInOne in printer, Report.pdf");
        allInOne.scan("allInOne in printer, Photo.jpg");
        allInOne.fax("allInOne in printer, Invoice.pdf");

        BasicPrinter basic = new BasicPrinter();
        basic.print("basic printer, Notes.txt");
        // basic.scan("something");  // Won't even COMPILE - method doesn't exist on BasicPrinter!
    }
}