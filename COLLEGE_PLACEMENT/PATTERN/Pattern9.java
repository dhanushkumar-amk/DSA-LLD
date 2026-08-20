package COLLEGE_PLACEMENT.PATTERN;

public class Pattern9 {
    static void main(String[] args) {

        int n = 10;

         int oddNumber = 1;
         int evenNumber = 2;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1){
                    System.out.print(oddNumber + " ");
                    oddNumber += 2;
                }else{
                    System.out.print(evenNumber + " ");
                    evenNumber += 2;
                }
            }
            System.out.println();
        }
    }
}
