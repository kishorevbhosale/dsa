package linkedlist;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> hashMap = null;
        test(hashMap);
    }

    private static void test(Map<String, String> hashMap) {
        if (hashMap == null) {
            System.out.println("null");
        }
    }
}
