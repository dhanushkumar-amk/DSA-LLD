package LLD.OOPS.CLASS;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "the number is" + num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    static void main() {
        ObjectDemo obj1 = new ObjectDemo(7080);
        System.out.println(obj1.hashCode());

//          ObjectDemo obj2 = new ObjectDemo(7080);
        ObjectDemo obj2 = obj1;
        System.out.println(obj2.hashCode());


        if (obj1.equals(obj2))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
