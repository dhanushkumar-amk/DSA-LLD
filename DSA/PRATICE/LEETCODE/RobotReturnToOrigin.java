package DSA.PRATICE.LEETCODE;

public class RobotReturnToOrigin {

    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {

        int countU = 0;
         int countD = 0;
          int countR = 0;
           int countL = 0;
        for(char step : moves.toCharArray()){
            if (step == 'U')
                countU++;
            else if (step == 'D')
                countD++;
            else if(step == 'L')
                countL++;
            else
                countR++;
        }

        return countL == countR && countD == countU;
    }
}
