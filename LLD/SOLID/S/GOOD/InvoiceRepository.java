package LLD.SOLID.S.GOOD;

public class InvoiceRepository {
    // ONLY responsibility: how an invoice gets persisted
    public void save(Invoice invoice) {
        System.out.println("Saving invoice for " + invoice.getCustomerName() + " to database...");
    }
}