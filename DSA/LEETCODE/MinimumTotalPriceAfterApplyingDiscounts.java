package DSA.LEETCODE;

import java.util.Arrays;

public class MinimumTotalPriceAfterApplyingDiscounts {
    static void main(String[] args) {

    }

     public double minPrice(int[] prices, int[] discounts) {
         Arrays.sort(prices);
         Arrays.sort(discounts);

         int i = prices.length - 1;
         int j = discounts.length - 1;

         double minimumPrice = 0.0;

         while (i >= 0 && j >= 0){
             double currentPrice = prices[i];
             double currentDiscount  = discounts[i];

             minimumPrice += ( double) (currentPrice * (100 - currentDiscount)) / 100;

             i--;
             j--;
         }

         while (i >= 0){
             minimumPrice += prices[i];
             i--;
         }

         return minimumPrice;
    }
}
