package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class FascinatingNumber {
    static void main(String[] args) {
        fascinating(193);
    }

    private static void fascinating(int n){
        StringBuilder str = new StringBuilder();

        int number1 = n * 1;
        int number2 = n * 2;
        int number3 = n * 3;

        str.append(number1);
        str.append(number2);
        str.append(number3);

        int number = Integer.parseInt(str.toString());

        int[] arr = new int[10];
        while (number != 0){
            int ld = number % 10;
            arr[ld]++;
            number /= 10;
        }

        boolean isfasc = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                isfasc = true;
                break;
            }
        }
        if(isfasc){
            System.out.println("It is not an fascinating number");
        }else {
            System.out.println("It is a fasinating number");
        }
    }
}
