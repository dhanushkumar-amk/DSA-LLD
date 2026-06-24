package LLD.OOPS.POLYMORPHISM;

public class Numbers {
    int  add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}
