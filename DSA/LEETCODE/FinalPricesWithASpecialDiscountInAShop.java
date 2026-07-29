package DSA.LEETCODE;

public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {

        int[] ans = new int[prices.length];


        for (int i = 0; i < prices.length; i++) {

            // Assume no discount
            ans[i] = prices[i];

            for (int j = i + 1; j < prices.length; j++) {

                if (prices[j] <= prices[i]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                }

            }
        }

        return ans;

    }
}
