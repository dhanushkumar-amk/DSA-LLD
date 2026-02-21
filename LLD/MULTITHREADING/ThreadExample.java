package LLD.MULTITHREADING;

public class ThreadExample extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Threads " + Thread.currentThread().getName() + " =>  is running ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
            ThreadExample thread1 = new ThreadExample();
            ThreadExample thread2 = new ThreadExample();

            thread1.start();
            thread2.start();
    }
}
