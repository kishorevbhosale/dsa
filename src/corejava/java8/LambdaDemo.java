package corejava.java8;

import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> comapreFun = (a,b) -> {
            System.out.println(a.compareTo(b));
        };
        comapreFun.accept(4,5);
    }
}
