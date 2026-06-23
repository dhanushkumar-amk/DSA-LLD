package LLD.OOPS.INHERITANCE;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice(double cost) {
        super();
        this.cost = -1;
    }

    public BoxPrice(double length, double width, double height, double weight, double cost) {
        super(length, width, height, weight);
        this.cost = cost;
    }


    BoxPrice(BoxPrice other){
        this.cost = other.cost;
    }

}
