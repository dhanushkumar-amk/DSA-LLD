package DSA.LEETCODE.MATH;

// https://leetcode.com/problems/water-bottles/

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        return  numBottles + (numBottles - 1) / (numExchange - 1);
    }

     public int numWaterBottles1(int numBottles, int numExchange) {
       int ans = numBottles;

       while (numBottles >= numExchange){
           int rem = numBottles % numExchange;
           numBottles = numBottles / numExchange;
           ans += numBottles;

           numBottles = rem;
       }
       return ans;
    }



}
