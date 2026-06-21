package LLD.OOPS.INHERITANCE;

public class BoxWeight extends  Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double length, double width, double height, double weight){
        super(length, height, width);
        this.weight = weight;
    }
}
