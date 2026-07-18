package DSA.HACKER_RANK;

import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i == k)
                continue;

            sum += bill.get(i);
        }

        int split = sum / 2;

        if (b == split)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - split);
    }

    public static void main(String[] args) {
        bonAppetit(List.of(3, 10, 2, 9), 1, 12);
        // Output: 5

        bonAppetit(List.of(3, 10, 2, 9), 1, 7);
        // Output: Bon Appetit
    }
}