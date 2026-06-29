package DSA.PRATICE.NEETCODE_150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CarFleet {

    public static void main(String[] args) {

        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};

        System.out.println(carFleet(target, position, speed)); // 3
    }

    public static int carFleet(int target, int[] position, int[] speed) {

        int fleetCount = position.length;

        Map<Integer, Float> map = new HashMap<>();

        // Store time taken for each car to reach target
        for (int i = 0; i < position.length; i++) {
            float time = (float) (target - position[i]) / speed[i];
            map.put(position[i], time);
        }

        // Sort positions in ascending order
        Arrays.sort(position);

        int i = position.length - 1;

        while (i > 0) {

            float currentFleetTime = map.get(position[i]);
            i--;

            // Cars behind that reach earlier or at the same time
            // merge into the fleet ahead.
            while (i >= 0 && map.get(position[i]) <= currentFleetTime) {
                fleetCount--;
                i--;
            }
        }

        return fleetCount;
    }
}