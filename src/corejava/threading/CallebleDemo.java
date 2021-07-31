package corejava.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

class Task implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(100);
        return new Random().nextInt();
    }
}
public class CallebleDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<Integer> flist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Future<Integer> future = service.submit(new Task());
            flist.add(future.get());
        }
        flist.stream().forEach(result ->{
            System.out.println(result);
        });
    }
}
