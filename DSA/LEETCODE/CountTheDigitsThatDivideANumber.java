package DSA.LEETCODE;

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int tempValue = num;
        int count = 0;

        while (tempValue != 0){
            int remainder = tempValue % 10;
            if (num % remainder == 0)
                count++;
            tempValue /= 10;
        }
        return count;
    }

}
