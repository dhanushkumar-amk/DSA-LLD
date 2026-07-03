package OOPS.INHERITANCE;

public class Box {
    double length;
    double height;
    double width;

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

// cube
    Box(double side){

//     it inherit the object class  (the  mian object)
        super();

        this.length = side;
        this.height = side;
        this.width = side;
    }

//    copy constructor
    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void displayInformation(){
        System.out.println("Running the Box");
    }

}
