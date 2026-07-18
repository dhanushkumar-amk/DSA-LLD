package DSA.HACKER_RANK;

import java.util.List;

public class AppleAndOrange {


    // s => start of the house
    // t => end of the house

    // a => apple tree location
    // b => orange tree location

    // apples  list => fallen locations
    // orange list => fallen location


     public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
         int appleCount = 0;
         int orangeCount = 0;

         for (int i = 0; i < apples.size(); i++) {
             int position = a + apples.get(i);

             if (position >= s && position <= t)
                 appleCount++;
         }

           for (int i = 0; i < oranges.size(); i++) {
             int position = b + oranges.get(i);

             if (position >= s && position <= t)
                 orangeCount++;
         }

         System.out.println(appleCount);
         System.out.println(orangeCount);
    }
}
