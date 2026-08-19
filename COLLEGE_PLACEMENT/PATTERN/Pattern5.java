package COLLEGE_PLACEMENT.PATTERN;

public class Pattern5 {
    static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 1){
                for (int j = 1; j <= n ; j++) {
                    if (j % 2 == 1)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }
            }
            else{
                    for (int j = 1; j <= n; j++) {
                        if (j % 2 == 0)
                            System.out.print(1 + " ");
                        else
                            System.out.print(0 + " ");
                    }
                }
            System.out.println();
            }
        }
    }
