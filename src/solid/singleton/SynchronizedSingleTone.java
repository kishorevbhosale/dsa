package solid.singleton;

public class SynchronizedSingleTone {
    private static SynchronizedSingleTone sc;

    private SynchronizedSingleTone() {
        if (sc != null)
            throw new RuntimeException("Object of class already created");
    }

    public static SynchronizedSingleTone getInstance() {
        if (sc == null) {
            synchronized (SynchronizedSingleTone.class) {
                if (sc == null)
                    sc = new SynchronizedSingleTone();
            }
        }
        return sc;
    }

    public static void main(String[] args) {
        SynchronizedSingleTone s1 = getInstance();
        SynchronizedSingleTone s2 = getInstance();
        System.out.println(s1.hashCode() + " " + s2.hashCode());
    }
}
