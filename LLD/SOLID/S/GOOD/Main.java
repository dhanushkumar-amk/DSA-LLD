package LLD.SOLID.S.GOOD;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("dhanushkumar", 1000);

        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        printer.print(invoice);
        repository.save(invoice);
    }
}