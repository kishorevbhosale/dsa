package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] s1= s.toLowerCase().toCharArray();
        char[] t1= t.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if (s1.length!=t1.length) return false;
        return Arrays.equals(s1,t1);
    }
    public static boolean isAnagramV1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
