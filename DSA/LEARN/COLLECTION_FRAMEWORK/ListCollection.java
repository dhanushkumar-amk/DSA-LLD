package DSA.LEARN.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.set(1, 100);

        List<Integer> list2 = new ArrayList<>(arrayList);
        list2.add(66);

//        System.out.println(arrayList.get(3));
//        System.out.println(arrayList.indexOf((int) new Integer(5)));

        List<Integer> arrayList3 = list2.subList(1,3);
//        System.out.println(arrayList3);
//        for (int list : list2)
//            System.out.println(list);


        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

//        System.out.println(ll);


        ListIterator<Integer> iterator = ll.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());

        // list to array
        Integer[] arr = ll.toArray(new Integer[0]);
        for (int i : arr)
            System.out.print( i + " ");
    }
}


