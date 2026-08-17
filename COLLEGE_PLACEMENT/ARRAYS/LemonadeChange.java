package COLLEGE_PLACEMENT.ARRAYS;

public class LemonadeChange {
    static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }


    public static boolean lemonadeChange(int[] bills) {
        int fiveDollarCount = 0;
        int tenDollarCount = 0;

        for (int bill : bills) {
            if (bill == 5)
                fiveDollarCount++;
            else if (bill == 10) {
                if (fiveDollarCount > 0) {
                    fiveDollarCount--;
                    tenDollarCount++;
                } else
                    return false;
            } else {
                if (tenDollarCount > 0 && fiveDollarCount > 0) {
                    tenDollarCount--;
                    fiveDollarCount--;
                } else if (fiveDollarCount >= 3)
                    fiveDollarCount -= 3;
                else
                    return false;
            }
        }
        return true;

    }
}