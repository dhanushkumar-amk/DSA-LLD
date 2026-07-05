package DSA.NEETCODE_150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TimeBasedKeyValueStore {

    public static void main(String[] args) {

        TimeMap timeMap = new TimeMap();

        timeMap.set("foo", "bar", 1);

        System.out.println(timeMap.get("foo", 1)); // bar
        System.out.println(timeMap.get("foo", 3)); // bar

        timeMap.set("foo", "bar2", 4);

        System.out.println(timeMap.get("foo", 4)); // bar2
        System.out.println(timeMap.get("foo", 5)); // bar2
        System.out.println(timeMap.get("foo", 2)); // bar
        System.out.println(timeMap.get("foo", 0)); // ""
    }
}

class TimeMap {

    /*
     * Stores every key and all of its timestamp-value pairs.
     *
     * Example:
     *
     * foo -> [(1, bar), (4, bar2), (7, bar3)]
     * abc -> [(2, hello), (8, world)]
     */
    private Map<String, ArrayList<TimeValuePair>> keyValueStore;

    public TimeMap() {
        keyValueStore = new HashMap<>();
    }

    /*
     * Stores a value for the given key at the given timestamp.
     *
     * Time Complexity : O(1)
     */
    public void set(String key, String value, int timestamp) {

        // Create a new list if this key is seen for the first time.
        if (!keyValueStore.containsKey(key)) {
            keyValueStore.put(key, new ArrayList<>());
        }

        // Add the new timestamp-value pair.
        keyValueStore.get(key)
                .add(new TimeValuePair(timestamp, value));
    }

    /*
     * Returns the value whose timestamp is the largest timestamp
     * less than or equal to the given timestamp.
     *
     * Time Complexity : O(log n)
     */
    public String get(String key, int timestamp) {

        // Key does not exist.
        if (!keyValueStore.containsKey(key)) {
            return "";
        }

        ArrayList<TimeValuePair> timestampValueList = keyValueStore.get(key);

        Optional<TimeValuePair> matchingPair =
                findLatestValidTimestamp(timestampValueList, timestamp);

        if (matchingPair.isEmpty()) {
            return "";
        }

        return matchingPair.get().value;
    }

    /*
     * Binary Search
     *
     * Finds the latest timestamp that is
     * less than or equal to targetTimestamp.
     */
    private Optional<TimeValuePair> findLatestValidTimestamp(
            ArrayList<TimeValuePair> timestampValueList,
            int targetTimestamp) {

        int left = 0;
        int right = timestampValueList.size() - 1;

        // Stores the best valid answer found so far.
        TimeValuePair latestValidPair = null;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            TimeValuePair currentPair = timestampValueList.get(middle);

            // Exact timestamp found.
            if (currentPair.timestamp == targetTimestamp) {
                return Optional.of(currentPair);
            }

            // Current timestamp is valid.
            // Save it and search on the right for a larger valid timestamp.
            if (currentPair.timestamp < targetTimestamp) {
                latestValidPair = currentPair;
                left = middle + 1;
            }
            // Current timestamp is greater than target.
            // Search on the left.
            else {
                right = middle - 1;
            }
        }

        return Optional.ofNullable(latestValidPair);
    }
}

/*
 * Represents one timestamp-value pair.
 *
 * Example:
 * (1, "bar")
 */
class TimeValuePair {

    int timestamp;
    String value;

    public TimeValuePair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}