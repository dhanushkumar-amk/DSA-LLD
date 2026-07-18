package DSA.HACKER_RANK;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
        public static int birthdayCakeCandles(List<Integer> candles) {
         Collections.sort(candles);

         int tallestCandles = candles.get(candles.size() - 1);
         int count = 0;

            for (int i = candles.size() - 1; i >= 0 ; i--) {
                if (candles.get(i) == tallestCandles)
                    count++;
                else
                    break;
            }
            return count;
        }
}
