package DSA.LEARN.ARRAY;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,7,3,48,96,43,2,5, 488};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
