package LLD.DESIGN_PRINCIPLES.SOLID.S.BAD;

public class BreadBaker {

    public void bakeBread(){
        System.out.println("Baking high quality Bread...");
    }

    public void manageInventories(){
        System.out.println("Managing Inventories...");
    }

    public void  orderSupplies(){
        System.out.println("Order supply...");
    }

    public void  serverCustomer(){
        System.out.println("Serve Customer...");
    }

    public static void main(String[] args) {
        BreadBaker breadBaker = new BreadBaker();
        breadBaker.bakeBread();
        breadBaker.manageInventories();
        breadBaker.orderSupplies();
        breadBaker.serverCustomer();
    }
}
