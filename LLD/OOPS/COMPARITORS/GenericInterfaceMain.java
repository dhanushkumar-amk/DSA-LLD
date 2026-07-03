package LLD.OOPS.COMPARITORS;

import LLD.OOPS.GENERICS.GenericInterface;

public class GenericInterfaceMain implements GenericInterface<Integer> {

    @Override
    public void display(Integer value) {
        System.out.println(value);
    }
}
