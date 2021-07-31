package leetcode;

import java.util.Arrays;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("ae", "aea"));
    }
    public static char findTheDifference(String s, String t) {
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i)-'a'] +=1;
        }
        for (int i = 0; i < t.length(); i++) {
            res[t.charAt(i)-'a'] -=1;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i]==-1)
                return (char)(97+i);
        }
        return (char)-1;
    }
}
