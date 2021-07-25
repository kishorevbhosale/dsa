package corejava;

class JoinThread implements Runnable{
    static Thread mainThread;
    @Override
    public void run() {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread : "+i);
        }
    }
}
public class DeadLockDemoUsingJoin {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t = new JoinThread();
        JoinThread.mainThread  = Thread.currentThread();
        Thread thread = new Thread(t);
        thread.start();
        thread.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread : "+i);
        }
    }
}
