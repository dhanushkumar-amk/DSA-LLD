package DSA.LEARN.ARRAY;

public class MajorityElementMoreThanNBy2 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2,1,1,1,1};
        System.out.println(majorityElement1(arr));
    }


    // bruteforce
    private static int majorityElement1(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > n/2)
                return arr[i];
        }
        return -1;
    }

    // optimal solution => Mores Voting algo
    private static int majorityElement2(int[] arr){
        int element = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0){
                count++;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            }else{
                count--;
            }
        }

        // if element is appearing more than n/2 check
        int elementCounter = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                elementCounter++;

        if (elementCounter > (arr.length) / 2)
            return element;

        return element;
    }

}
