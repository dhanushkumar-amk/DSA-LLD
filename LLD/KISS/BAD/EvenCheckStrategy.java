package LLD.KISS.BAD;

public class EvenCheckStrategy implements NumberCheckStrategy {
    @Override
    public boolean check(int number) {
        return number % 2 == 0;
    }
}