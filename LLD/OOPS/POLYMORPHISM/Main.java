package LLD.OOPS.POLYMORPHISM;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        square.fun();

        Square sq = new Square();
        sq.square();


        shape.area();
        square.area();
        circle.area();
    }
}
