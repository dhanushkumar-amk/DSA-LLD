package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class PronicNumber {
    static void main(String[] args) {
        System.out.println(pronicNumber(13));
    }


    private static boolean pronicNumber(int n){
        int  i = 0;
        while(i * ( i + 1) <= n){
            if (i * (i + 1) == n)
                return true;
            i++;
        }

        return false;
    }
}
