package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class MinimumDeletions {
    public static void main(String[] args) {
        minDeletions("aaabbbcc");
    }
    public static void minDeletions(String s) {
        char[] strArr= s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: strArr){
            if (map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c,1);
        }


        map.forEach((key, value) -> System.out.println(key + "" + value));
    }
}
