package LLD.DESIGN_PRINCIPLES.SOLID.S.GOOD;


// here each class has a separate code and easy to maintainable

class BakeBread{
    public void bakeBread(){
        System.out.println("Baking high quality Bread...");
    }
}


class ManageInventory{
    public void manageInventories(){
        System.out.println("Managing Inventories...");
    }
}

class OrderSupplies{
    public void  orderSupplies(){
        System.out.println("Order supply...");
    }
}

class ServeCustomer{
    public void  serverCustomer(){
        System.out.println("Serve Customer...");
    }
}

public class GoodCode {
    public static void main(String[] args) {
        BakeBread bakeBread = new BakeBread();
        ManageInventory manageInventory = new ManageInventory();
        OrderSupplies orderSupplies = new OrderSupplies();
        ServeCustomer serveCustomer = new ServeCustomer();

        bakeBread.bakeBread();
        manageInventory.manageInventories();
        orderSupplies.orderSupplies();
        serveCustomer.serverCustomer();
    }
}


