package corejava.threading;

class MyThread extends Thread{
    MyThread(ThreadGroup group, String name){
        super(group,name);
    }
    public void run(){
        System.out.println("child");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println("current active thread group name : "+Thread.currentThread().getThreadGroup().getName());
        System.out.println("current active parent thread group name : "+Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup pg = new ThreadGroup("parent");
        ThreadGroup cg = new ThreadGroup(pg, "child");
        MyThread t1 = new MyThread(pg, "ch1");
        MyThread t2 = new MyThread(cg, "ch2");
        t1.start();
        t2.start();
        System.out.println("parent active thread Count : "+pg.activeCount());
        System.out.println("parent active threadGroup Count : "+pg.activeGroupCount());
        System.out.println("Current Active Threads : -------");
        getActiveThreads();
        System.out.println("Current active threads in declared thread group : --------");
        threagGroupDeclaration();

    }

    private static void threagGroupDeclaration(){
        ThreadGroup g = new ThreadGroup("first");
        ThreadGroup g1 = new ThreadGroup(g, "second");
        System.out.println(g.getName());
        System.out.println(g1.getParent().getName());
        System.out.println(g1.getName());
    }

    private static void getActiveThreads() {
        ThreadGroup group = Thread.currentThread().getThreadGroup().getParent();
        int threadCount = group.activeCount();
        Thread threadList[] = new Thread[threadCount];
        group.enumerate(threadList);
        for (int i = 0; i < threadCount; i++)
            System.out.println(threadList[i].getName());
    }
}
