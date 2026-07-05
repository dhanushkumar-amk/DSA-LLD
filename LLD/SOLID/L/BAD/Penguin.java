package LLD.SOLID.L.BAD;

public class Penguin extends Bird {
    // here the problem penguin can't fly  but we forcly override the parent class method to a child class
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }

    // pnguin can eat but not fly
    @Override
    public void eat() {
        super.eat();
    }
}