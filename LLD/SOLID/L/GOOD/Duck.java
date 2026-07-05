package LLD.SOLID.L.GOOD;

public class Duck extends Bird{
    @Override
    public void eat() {
        super.eat();
    }

    // here we created fly method so it will come only the bird
    public void fly(){
        System.out.println("I am duck and i can fly....");
    }
}
