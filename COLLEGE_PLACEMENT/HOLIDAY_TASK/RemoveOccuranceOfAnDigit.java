package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class RemoveOccuranceOfAnDigit {
    static void main(String[] args) {
        remove(1232334, 2);
    }

    private static void remove(int n, int digit){
        StringBuilder sb = new StringBuilder();

        while (n != 0){
            int ld = n % 10;
            if (ld != digit)
                sb.append(ld);
            n /= 10;
        }

        System.out.println(sb.reverse());
    }
}
