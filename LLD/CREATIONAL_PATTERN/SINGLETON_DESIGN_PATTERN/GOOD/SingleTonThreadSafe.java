package LLD.CREATIONAL_PATTERN.SINGLETON_DESIGN_PATTERN.GOOD;

public class SingleTonThreadSafe {

    // volatile ensures all threads see the latest value of "instance" immediately
    // volatile tells Java: "Don't let any thread keep a private/cached copy of this variable in its own memory.
    // Always read and write the ACTUAL, latest value directly from Main memory."
    private static volatile  SingleTonThreadSafe instance;

    // private constructor
    private SingleTonThreadSafe() {
    }


    public static SingleTonThreadSafe getInstance(){
        // First check - WITHOUT locking (fast, for the common case where instance already exists)
        if (instance == null) {
            // Only lock if instance might still need creating
            synchronized (SingleTonThreadSafe.class) {
                // Second check - INSIDE the lock, to be 100% sure no other thread just created it
                if (instance == null) {
                    instance = new SingleTonThreadSafe();
                }
            }
        }
        return instance;
    }
}
