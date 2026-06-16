package DSA.PRATICE.NEETCODE_150;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {

    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length)
            return nums;


        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        // add based on count (accending manner)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                (a, b) -> hashMap.get(a) - hashMap.get(b)
        );

        for(int key : hashMap.keySet()){
            priorityQueue.add(key);

            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = priorityQueue.poll();
        }
        return ans;

    }
}