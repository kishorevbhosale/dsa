package corejava.threading;

import java.util.concurrent.*;

class MyCallable implements Callable {
    int num;
    String name;

    MyCallable(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(name + "started...");
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }
}

public class ThreadPoolExecutorCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable[] jobs = {new MyCallable(10, "job1"),
                new MyCallable(7, "job2"),
                new MyCallable(5, "job3")};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (MyCallable job : jobs) {
            Future f = service.submit(job);
            System.out.println(job.name + " : " + f.get());
        }
    }
}
