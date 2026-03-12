package DSA.LEARN.LL;

import java.util.ArrayList;

public class PairSumInDoublyLL {

    static class Node {
        int data;
        Node next, prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (head == null)
            return ans;

        Node left = head;
        Node right = findTail(head);

        while (left != null && right != null && left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);

                left = left.next;
                right = right.prev;
            }
            else if (sum < target) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }

        return ans;
    }

    private static Node findTail(Node head) {

        Node tail = head;

        while (tail.next != null)
            tail = tail.next;

        return tail;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        fifth.next = sixth;
        sixth.prev = fifth;

        int target = 7;

        ArrayList<ArrayList<Integer>> result = findPairsWithGivenSum(target, head);

        System.out.println("Pairs with sum " + target + ":");
        for (ArrayList<Integer> pair : result) {
            System.out.println(pair.get(0) + " , " + pair.get(1));
        }
    }
}