package solid.singleton;

public class SingleTonPatternLazyInitialization {
    private static SingleTonPatternLazyInitialization aClass;

    private SingleTonPatternLazyInitialization() {
    }

    public static SingleTonPatternLazyInitialization getInstance() {
        if (aClass == null)
            aClass = new SingleTonPatternLazyInitialization();
        return aClass;
    }

    public static void main(String[] args) {
        SingleTonPatternLazyInitialization sl1 = getInstance();
        SingleTonPatternLazyInitialization sl2 = getInstance();
        System.out.println(sl1.hashCode() + " " + sl2.hashCode());

    }
}
