package solid.singleton;

public class SingleToneToPreventJavaReflectionAPI {
    private static SingleToneToPreventJavaReflectionAPI sc;

    private SingleToneToPreventJavaReflectionAPI() {
        if (sc != null)
            throw new RuntimeException("Object of class already created");
    }

    public static SingleToneToPreventJavaReflectionAPI getInstance() {
        if (sc == null)
            sc = new SingleToneToPreventJavaReflectionAPI();
        return sc;
    }

    public static void main(String[] args) {
        SingleToneToPreventJavaReflectionAPI s1 = getInstance();
        SingleToneToPreventJavaReflectionAPI s2 = getInstance();
        System.out.println(s1.hashCode() + " " + s2.hashCode());
    }
}
