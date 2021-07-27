package corejava.threading;

import java.util.concurrent.locks.ReentrantLock;

class Display {
    ReentrantLock lock = new ReentrantLock();

    public void wish(String name) {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.print(name + "\n");
        }
        lock.unlock();
    }
}

class MythreadClass extends Thread {
    Display display;
    String name;

    MythreadClass(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}

public class ReentrentLockDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MythreadClass t1 = new MythreadClass(d, "Sonu");
        MythreadClass t2 = new MythreadClass(d, "Kishu");
        t1.start();
        t2.start();
    }
}
