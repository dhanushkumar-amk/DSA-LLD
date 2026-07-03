package LLD.SOLID.S.GOOD;

public class InvoicePrinter {
    // ONLY responsibility: how an invoice gets displayed/printed
    public void print(Invoice invoice) {
        System.out.println("Invoice for: " + invoice.getCustomerName());
        System.out.println("Total (with tax): " + invoice.calculateTotalWithTax());
    }
}