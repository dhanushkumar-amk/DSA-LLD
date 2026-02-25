package DSA.LEARN.BINARY_SEARCH;

public class PeakElement {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,5,1};
       int ans = peak2(arr);
        System.out.println(ans);
    }

    // brute force
    private static int peak1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i - 1] < arr[i] )&& (i == arr.length - 1  || arr[i] > arr[i + 1]))
                return i;
        }
        return -1;
    }




    //optimal solution for none peak element
    private static int peak2(int[] arr){
       int n = arr.length;

       if (n == 0)
           return 0;

       if (arr[0] > arr[1])
           return 0;

       if(arr[n - 1] > arr[n - 2])
           return n - 1;

       int low = 0;
       int high = n - 2;

       while (low <= high){
           int mid = low + (high - low)/2;

           if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
               return arr[mid];
           else if (arr[mid] > arr[mid - 1])
               low = mid + 1;
           else
               high = mid - 1;
       }
        return -1;
    }

}
