package leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for (char c: map.keySet()){
            if (map.get(c)==1) {
                return s.indexOf(""+c);
            }
        }
    return  -1;
    }

    public static int firstUniq(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }
}
