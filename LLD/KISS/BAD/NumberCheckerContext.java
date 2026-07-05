package LLD.KISS.BAD;

public class NumberCheckerContext {
    private NumberCheckStrategy strategy;

    public NumberCheckerContext(NumberCheckStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isEven(int number) {
        return strategy.check(number);
    }
}