package DSA.LEARN.LINKEDLIST;

public class DNode {
    int value;
    DNode prev;
    DNode next;

    public DNode(int value, DNode prev, DNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public DNode(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
