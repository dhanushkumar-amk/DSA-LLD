package DSA.LEARN.BINARY_SEARCH;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        int ans = singleElement(arr);
        System.out.println(ans);
    }


    // bruteforce
    private static int singleElement(int[] arr){
        if (arr.length == 1)
            return arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                if (arr[i] != arr[i + 1])
                    return arr[i];
            }
            else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1])
                    return arr[i];
            }
            else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                    return arr[i];
            }
        }
        return -1;
    }
}
