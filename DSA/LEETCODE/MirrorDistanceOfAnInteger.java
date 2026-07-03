package DSA.LEETCODE;

public class MirrorDistanceOfAnInteger {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(mirrorDistance(n));
    }
     public static int mirrorDistance(int n) {
        int temp = n;

        int sum = 0;
        while(temp > 0){
            int lastDigit = temp % 10;
            sum = sum * 10 + lastDigit;
            temp = temp / 10;
        }

        return Math.abs(n - sum);
    }
}
