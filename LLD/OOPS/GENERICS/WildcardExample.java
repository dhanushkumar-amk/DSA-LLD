package LLD.OOPS.GENERICS;


/*
* ?                  -> Any type

? extends Number   -> Read only
                     (can safely read as Number)

? super Integer    -> Write only
                     (can safely add Integer)
*
* */

import java.util.Arrays;

public class WildcardExample<T extends Number> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 5;
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    @SuppressWarnings("unchecked")
    public T remove() {
        return (T) data[--size];
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayListUsingGenerics{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove());

        list.set(0, 100);

        System.out.println(list);
    }
}