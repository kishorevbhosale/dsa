package linkedlist;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> hashMap = null;

        /*hashMap.put(null, "#FF0000");
        hashMap.put("BLACK", null);
        hashMap.put("BLUE", "#0000FF");
        hashMap.put("GREEN", "#008000");
        hashMap.put("WHITE", null);
        //hashMap = hashMap.entrySet().removeIf(Objects::isNull);
        hashMap = hashMap.entrySet().removeIf(key->key.getKey()==null);*/
        test(hashMap);


    }

    private static void test(Map<String, String> hashMap) {
        if (hashMap == null) {
            System.out.println("null");
        }
    }
}
