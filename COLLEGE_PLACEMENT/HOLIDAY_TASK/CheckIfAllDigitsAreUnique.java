package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class CheckIfAllDigitsAreUnique {
    static void main(String[] args) {
        isUnique(123455);
    }

    private static void isUnique(int n){
        boolean[] frequency = new boolean[10];

        boolean isUnique = true;

        while(n != 0){
            int ld = n % 10;
            if (frequency[ld] == false)
                    frequency[ld] = true;
            else
               isUnique = false;

            n /= 10;
        }

        if (isUnique)
            System.out.println("It is unique");
        else
            System.out.println("Not unique");
    }
}
