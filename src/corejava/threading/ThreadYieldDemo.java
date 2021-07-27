package corejava.threading;

public class ThreadYieldDemo {
    public static void main(String[] args) {
        Runnable r = ()->{
            int count = 0;
            while (count<2){
                System.out.println(Thread.currentThread().getName());
                count++;
                Thread.yield();
            }
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
