package solid.singleton;

public class TwoThreadAccessSingleton {
    private static TwoThreadAccessSingleton sc;

    private TwoThreadAccessSingleton() {
        if (sc != null)
            throw new RuntimeException("Object of class already created");
    }

    public static TwoThreadAccessSingleton getInstance() {
        if (sc == null)
            sc = new TwoThreadAccessSingleton();
        return sc;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            TwoThreadAccessSingleton instance = getInstance();
            System.out.println(instance.hashCode());
        });

        Thread t2 = new Thread(() -> {
            TwoThreadAccessSingleton instance = getInstance();
            System.out.println(instance.hashCode());
        });
        t1.start();
        t2.start();

    }

}
