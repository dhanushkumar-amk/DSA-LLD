package LLD.CREATIONAL_PATTERN.FACTORY_DESIGN_PATTERN.BAD;

public class Pasta implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pasta: boil pasta, add sauce, garnish");
    }
}