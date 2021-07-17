package leetcode;

import java.util.Arrays;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int i=0;
        while (i<k--){
            char tmp = chars[i];
            chars[i++] = chars[k];
            chars[k] = tmp;
        }
        return String.valueOf(chars);
    }
}
