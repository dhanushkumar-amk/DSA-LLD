package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

public class KunalEvenDaysInAugust {
    static void main(String[] args) {
        System.out.println(countEvenDays(31));
    }

       private static int countEvenDays(int totalDays) {
        int count = 0;
        for (int day = 1; day <= totalDays ; day++) {
            if (day % 2 == 0)
                count++;
        }
        return count;
    }

}
