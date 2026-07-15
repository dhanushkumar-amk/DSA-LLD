package DSA.LEETCODE;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int addSum = 0;
        int multipleSm = 1;

        while (n != 0){
            int remainder = n % 10;
            addSum += remainder;
            multipleSm *= remainder;
            n = n / 10;
        }
        return multipleSm - addSum;
    }
}
