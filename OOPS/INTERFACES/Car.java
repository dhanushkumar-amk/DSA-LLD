package OOPS.INTERFACES;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like a normal car");
    }
}
