package COLLEGE_PLACEMENT.ARRAYS;

public class PrintNameCharArray {
    static void main(String[] args) {
       char[] name =  {'d', 'h', 'a', 'n', 'u', 's', 'h', 'k', 'u',
       'm', 'a', 'r'};

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }

        System.out.println();

        String name2 = "dhanushkumar";
        for (int i = 0; i < name2.length(); i++) {
            System.out.print(name2.charAt(i));
        }
    }


}
