package DSA.LEETCODE;

public class NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employeeCount = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target)
                employeeCount++;
        }
        return employeeCount;
    }
}
