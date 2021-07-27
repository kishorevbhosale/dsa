package corejava.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " completed");
    }
}

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = {new PrintJob("job1"),
                new PrintJob("job2"),
                new PrintJob("job3"),
                new PrintJob("job4"),};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
