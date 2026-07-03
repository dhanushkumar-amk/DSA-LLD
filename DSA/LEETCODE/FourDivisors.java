package DSA.LEETCODE;

// problem url => https://leetcode.com/problems/four-divisors/submissions/1874151218/?envType=daily-question&envId=2026-01-04
// problem name => Four Divisors

public class FourDivisors {

    public static void main(String[] args) {
        int[] arr = {21, 4, 7};
        System.out.println(sumFourDivisors(arr));
    }

    public static int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    count++;
                    sum += d1;

                    if (d1 != d2) {
                        count++;
                        sum += d2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
}
