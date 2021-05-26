package recursion;

public class StaticVariableRecursion {
    static int x = 0;

    public static void main(String[] args) {
        System.out.println("Static variable example");
        staticFun(5);
        System.out.println(x);
    }

    private static void staticFun(int i) {
        if (i > 0) {
            x += 10;
            staticFun(i - 1);
        }
    }
}
