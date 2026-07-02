package LLD.OOPS.INTERFACES.NESTEDINTERFCE;

public class B implements A.NestedInterface{
    @Override
    public boolean isEven(int num) {
        return (num & 1) == 0;
    }
}

class C implements  A.NestedInterface{
    @Override
    public boolean isEven(int num) {
          return (num & 1) == 0;
    }
}
