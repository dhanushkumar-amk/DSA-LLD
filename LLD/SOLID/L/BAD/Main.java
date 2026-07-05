package LLD.SOLID.L.BAD;

public class Main {
    static void main() {
      MakeFly makeFly = new MakeFly();
      makeFly.makeFly(new Duck());  // it will work duck can fly
      makeFly.makeFly(new Penguin()); // it won't work because the penguin can't fly
    }
}
