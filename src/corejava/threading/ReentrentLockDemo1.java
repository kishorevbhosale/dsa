package corejava.threading;

import java.util.concurrent.locks.ReentrantLock;

class MyThreadDemo1 extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThreadDemo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (l.tryLock()) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            l.unlock();
        } else {
            System.out.println("2nd thread - no lock");
        }
    }
}

public class ReentrentLockDemo1 {
    public static void main(String[] args) {
        MyThreadDemo1 t1 = new MyThreadDemo1("Sonu");
        MyThreadDemo1 t2 = new MyThreadDemo1("KB");
        t1.start();
        t2.start();
    }
}
