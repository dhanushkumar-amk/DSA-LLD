package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

public class HowManyNumbersSmallerThanCurrent {
    static void main(String[] args) {
        int[]  arr = {5,4,3,2,1};
        int[] ans = countNumber(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }


    private static int[] countNumber(int[] arr){
        
        int[] frequencyArray  = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[i])
                    count++;
            }
            frequencyArray[i] = count;
        }
        return frequencyArray;
    }
}
