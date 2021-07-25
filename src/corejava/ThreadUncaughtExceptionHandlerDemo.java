package corejava;

public class ThreadUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Run method started performing 10/0");
                throw new RuntimeException("Intentional exception thrown");
            }
        });
        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Runtime exception occured for thread : " + t.getName());
                System.out.println(e);
            }
        });
        t.setName("LocalThread");
        t.start();
    }
}
