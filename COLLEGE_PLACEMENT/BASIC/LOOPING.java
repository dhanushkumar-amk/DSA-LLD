package COLLEGE_PLACEMENT.BASIC;

class LOOPING{
    public static void main()
    {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if ( (i & 1) == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("The total even sum :" + sum);
    }




}