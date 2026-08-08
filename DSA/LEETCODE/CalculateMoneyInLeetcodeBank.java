package DSA.LEETCODE;

public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {
       // Number of complete weeks
        int weeks = n / 7;

        // Remaining days
        int days = n % 7;

        // Sum of complete weeks
        // Weekly totals are:
        // 28, 35, 42, 49, ...
        //
        // a = 28
        // d = 7
        int weeklyMoney = weeks * (2 * 28 + (weeks - 1) * 7) / 2;

        // Money from remaining days
        // After 'weeks' complete weeks,
        // the next Monday starts with weeks + 1.
        //
        // Example:
        // weeks = 2
        // next week starts: 3, 4, 5, ...
        int remainingMoney =
                days * (2 * (weeks + 1) + (days - 1)) / 2;

        return weeklyMoney + remainingMoney;
    }

}
