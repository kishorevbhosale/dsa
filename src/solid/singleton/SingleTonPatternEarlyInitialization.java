package solid.singleton;

public class SingleTonPatternEarlyInitialization {
    private static SingleTonPatternEarlyInitialization aClass = new SingleTonPatternEarlyInitialization();

    private SingleTonPatternEarlyInitialization() {
    }

    public static SingleTonPatternEarlyInitialization getInstance() {
        return aClass;
    }

    public static void main(String[] args) {
        SingleTonPatternEarlyInitialization s1 = getInstance();
        SingleTonPatternEarlyInitialization s2 = getInstance();
        System.out.println(s1.hashCode() + "  " + s2.hashCode());
    }
}
