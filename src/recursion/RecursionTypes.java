package recursion;

public class RecursionTypes {
    public static void main(String[] args) {
        System.out.println("Tail Recursion output : ");
        tailRecursion(5);
        System.out.println("\n\nHead Recursion output : ");
        headRecursion(5);
        System.out.println("\n\nTree Recursion output :");
        treeRecursion(3);
        System.out.println("\n\nNested Recursion output :");
        System.out.println("nestedRecursion(95) : " + nestedRecursion(95));
        System.out.println("\nIndirect Recursion output : ");
        indirectRecursionDemo(5);
    }


    private static void tailRecursion(int i) {
        if (i > 0) {
            System.out.print(i + ",");
            tailRecursion(i - 1);
        }

    }

    private static void headRecursion(int i) {
        if (i > 0) {
            headRecursion(i - 1);
            System.out.print(i + ",");
        }
    }

    private static void treeRecursion(int i) {
        if (i > 0) {
            System.out.print(i + ",");
            treeRecursion(i - 1);
            treeRecursion(i - 1);
        }
    }

    private static int nestedRecursion(int i) {
        if (i > 100) {
            return i - 10;
        } else {
            return nestedRecursion(nestedRecursion(i + 11));
        }
    }

    private static void indirectRecursionDemo(int n) {
        fun1(n);
    }

    private static void fun1(int n) {
        if (n > 0) {
            System.out.print(n + ",");
            fun2(n - 1);
        }
    }

    private static void fun2(int n) {
        if (n > 0) {
            System.out.print(n + ",");
            fun1(n - 2);
        }
    }


}
