package LLD.DESIGN_PRINCIPLES.SOLID.L.BAD;

public class Bicycle extends Vehicle{

    public Bicycle(String name){
        super(name);
    }

    @Override
    public void move() {
        super.move();
    }

    // ❌ Bicycle can't start engine - what to do?
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycle has no engine!");
    }

    // ❌ Bicycle can't stop engine - what to do?
    @Override
    public void stopEngine() {
        throw new UnsupportedOperationException("Bicycle has no engine!");
    }

    // ❌ Bicycle doesn't need fuel - what to do?
    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Bicycle doesn't need fuel!");
    }


}
